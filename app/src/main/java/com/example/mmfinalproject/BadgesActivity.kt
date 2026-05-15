package com.example.mmfinalproject

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class BadgesActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.mmfinalproject.R.layout.activity_badges)

        val txtBadges = findViewById<TextView>(com.example.mmfinalproject.R.id.txtBadges)
        txtBadges.text = getBadgeDetails()
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

        result.append("Badges Earned\n\n")

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

                result.append("$district\n")
                result.append("Badge: $badge")

                if (score >= 0) {
                    result.append(" ($score/5)")
                }

                result.append("\n\n")
            }
        }

        if (!found) {
            result.append("No badges earned yet.\nComplete quizzes to earn badges.")
        }

        return result.toString()
    }
}
