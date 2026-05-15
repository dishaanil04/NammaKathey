package com.example.mmfinalproject

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import kotlin.math.*

class NearbyStatuesActivity : AppCompatActivity() {

    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var recyclerView: RecyclerView
    private lateinit var tvStatus: TextView
    private lateinit var btnRetry: Button

    companion object {
        private const val LOCATION_PERMISSION_REQUEST = 1001
        // Default fallback: Bengaluru centre
        private const val DEFAULT_LAT = 12.9716
        private const val DEFAULT_LNG = 77.5946
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nearby_statues)

        supportActionBar?.title = "Nearby Hero Statues"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.rvStatues)
        tvStatus = findViewById(R.id.tvStatus)
        btnRetry = findViewById(R.id.btnRetry)

        recyclerView.layoutManager = LinearLayoutManager(this)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        btnRetry.setOnClickListener { requestLocation() }

        requestLocation()
    }

    private fun requestLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                LOCATION_PERMISSION_REQUEST
            )
        } else {
            fetchLocation()
        }
    }

    private fun fetchLocation() {
        tvStatus.text = "📍 Getting your location..."
        tvStatus.visibility = View.VISIBLE
        btnRetry.visibility = View.GONE

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED
        ) {
            loadWithLocation(DEFAULT_LAT, DEFAULT_LNG, usingDefault = true)
            return
        }

        fusedLocationClient.getCurrentLocation(Priority.PRIORITY_BALANCED_POWER_ACCURACY, null)
            .addOnSuccessListener { location: Location? ->
                if (location != null) {
                    loadWithLocation(location.latitude, location.longitude, usingDefault = false)
                } else {
                    // Try last known location
                    fusedLocationClient.lastLocation
                        .addOnSuccessListener { last: Location? ->
                            if (last != null) {
                                loadWithLocation(last.latitude, last.longitude, usingDefault = false)
                            } else {
                                loadWithLocation(DEFAULT_LAT, DEFAULT_LNG, usingDefault = true)
                            }
                        }
                        .addOnFailureListener {
                            loadWithLocation(DEFAULT_LAT, DEFAULT_LNG, usingDefault = true)
                        }
                }
            }
            .addOnFailureListener {
                loadWithLocation(DEFAULT_LAT, DEFAULT_LNG, usingDefault = true)
            }
    }

    private fun loadWithLocation(lat: Double, lng: Double, usingDefault: Boolean) {
        val sorted = StatueData.statues.map { statue ->
            statue.copy(distanceKm = haversineKm(lat, lng, statue.latitude, statue.longitude))
        }.sortedBy { it.distanceKm }

        if (usingDefault) {
            tvStatus.text = "⚠️ Could not get your location. Showing distances from Bengaluru."
            tvStatus.visibility = View.VISIBLE
            btnRetry.visibility = View.VISIBLE
        } else {
            tvStatus.visibility = View.GONE
            btnRetry.visibility = View.GONE
        }

        recyclerView.adapter = StatueAdapter(sorted) { statue, action ->
            when (action) {
                "wiki" -> openUrl(statue.wikipediaUrl)
                "maps" -> openUrl(statue.mapsUrl)
            }
        }
    }

    private fun openUrl(url: String) {
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        } catch (e: Exception) {
            Toast.makeText(this, "Could not open link", Toast.LENGTH_SHORT).show()
        }
    }

    private fun haversineKm(lat1: Double, lng1: Double, lat2: Double, lng2: Double): Double {
        val r = 6371.0
        val dLat = Math.toRadians(lat2 - lat1)
        val dLng = Math.toRadians(lng2 - lng1)
        val a = sin(dLat / 2).pow(2) +
                cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) * sin(dLng / 2).pow(2)
        return r * 2 * atan2(sqrt(a), sqrt(1 - a))
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LOCATION_PERMISSION_REQUEST) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                fetchLocation()
            } else {
                loadWithLocation(DEFAULT_LAT, DEFAULT_LNG, usingDefault = true)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}

// ── Adapter ──────────────────────────────────────────────────────────────────

class StatueAdapter(
    private val items: List<StatueInfo>,
    private val onAction: (StatueInfo, String) -> Unit
) : RecyclerView.Adapter<StatueAdapter.VH>() {

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvStatueName)
        val tvDistrict: TextView = view.findViewById(R.id.tvStatueDistrict)
        val tvLocation: TextView = view.findViewById(R.id.tvStatueLocation)
        val tvDistance: TextView = view.findViewById(R.id.tvStatueDistance)
        val btnWiki: Button = view.findViewById(R.id.btnWikipedia)
        val btnMaps: Button = view.findViewById(R.id.btnMaps)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_statue, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val statue = items[position]
        holder.tvName.text = "${position + 1}. ${statue.heroName}"
        holder.tvDistrict.text = "📍 ${statue.district}"
        holder.tvLocation.text = statue.locationName
        holder.tvDistance.text = if (statue.distanceKm >= 0)
            "%.1f km away".format(statue.distanceKm)
        else
            "Distance unknown"
        holder.btnWiki.setOnClickListener { onAction(statue, "wiki") }
        holder.btnMaps.setOnClickListener { onAction(statue, "maps") }
    }

    override fun getItemCount() = items.size
}
