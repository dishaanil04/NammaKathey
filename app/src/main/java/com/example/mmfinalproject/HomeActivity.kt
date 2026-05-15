package com.example.mmfinalproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.mmfinalproject.R.layout.activity_home)

        val btnProfile = findViewById<Button>(com.example.mmfinalproject.R.id.btnProfile)
        val btnLogout = findViewById<Button>(com.example.mmfinalproject.R.id.btnLogout)
        val btnNearbyStatues = findViewById<Button>(com.example.mmfinalproject.R.id.btnNearbyStatues)

        btnProfile.setOnClickListener {
            startActivity(Intent(this, BadgesActivity::class.java))
        }

        btnNearbyStatues.setOnClickListener {
            startActivity(Intent(this, NearbyStatuesActivity::class.java))
        }

        btnLogout.setOnClickListener {
            val prefs = getSharedPreferences("login_status", MODE_PRIVATE)
            prefs.edit().putBoolean("isLoggedIn", false).apply()

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnBagalkote, "Bagalkote")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnBallari, "Ballari")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnBelagavi, "Belagavi")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnBengaluruUrban, "Bengaluru Urban")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnBengaluruRural, "Bengaluru Rural")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnBidar, "Bidar")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnChamarajanagar, "Chamarajanagar")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnChikkaballapura, "Chikkaballapura")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnChikkamagaluru, "Chikkamagaluru")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnChitradurga, "Chitradurga")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnDakshinaKannada, "Dakshina Kannada")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnDavanagere, "Davanagere")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnDharwad, "Dharwad")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnGadag, "Gadag")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnHassan, "Hassan")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnHaveri, "Haveri")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnKalaburagi, "Kalaburagi")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnKodagu, "Kodagu")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnKolar, "Kolar")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnKoppal, "Koppal")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnMandya, "Mandya")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnMysuru, "Mysuru")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnRaichur, "Raichur")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnRamanagara, "Ramanagara")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnShivamogga, "Shivamogga")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnTumakuru, "Tumakuru")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnUdupi, "Udupi")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnUttaraKannada, "Uttara Kannada")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnVijayapura, "Vijayapura")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnVijayanagara, "Vijayanagara")
        setDistrictClickIfExists(com.example.mmfinalproject.R.id.btnYadgir, "Yadgir")
    }

    private fun setDistrictClickIfExists(buttonId: Int, district: String) {
        val button = findViewById<Button?>(buttonId)
        button?.setOnClickListener {
            val intent = Intent(this, HeroDetailActivity::class.java)
            intent.putExtra("district", district)
            startActivity(intent)
        }
    }

    private fun getBadgeDetails(): String {
        val districts = listOf(
            "Bagalkote", "Ballari", "Belagavi", "Bengaluru Urban", "Bengaluru Rural",
            "Bidar", "Chamarajanagar", "Chikkaballapura", "Chikkamagaluru",
            "Chitradurga", "Dakshina Kannada", "Davanagere", "Dharwad", "Gadag",
            "Hassan", "Haveri", "Kalaburagi", "Kodagu", "Kolar", "Koppal",
            "Mandya", "Mysuru", "Raichur", "Ramanagara", "Shivamogga",
            "Tumakuru", "Udupi", "Uttara Kannada", "Vijayapura", "Vijayanagara",
            "Yadgir"
        )

        val prefs = getSharedPreferences("badges", MODE_PRIVATE)
        val allBadges = prefs.all

        val result = StringBuilder()
        var found = false

        result.append("My Badges:\n")

        for (district in districts) {
            val badgeValue = allBadges["${district}_badge"]
            val scoreValue = allBadges["${district}_score"]

            val badge = when (badgeValue) {
                is String -> badgeValue
                is Boolean -> if (badgeValue) "Earned" else null
                else -> null
            }

            val score = when (scoreValue) {
                is Int -> scoreValue
                else -> -1
            }

            if (badge != null) {
                found = true
                result.append("$district - $badge")

                if (score >= 0) {
                    result.append(" ($score/5)")
                }

                result.append("\n")
            }
        }

        if (!found) {
            result.append("No badges earned yet.")
        }

        return result.toString()
    }
}
