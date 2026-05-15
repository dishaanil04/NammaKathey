package com.example.mmfinalproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import java.util.Locale

class HeroDetailActivity : Activity(), TextToSpeech.OnInitListener {

    private lateinit var textToSpeech: TextToSpeech
    private lateinit var heroes: List<HeroInfo>
    private lateinit var adapter: HeroPagerAdapter
    private var currentIndex = 0
    private var isKannada = false
    private lateinit var district: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.mmfinalproject.R.layout.activity_hero_detail)

        district = intent.getStringExtra("district") ?: "Belagavi"
        heroes = HeroStore.getHeroes(district)

        textToSpeech = TextToSpeech(this, this)

        val switchKannada = findViewById<Switch>(com.example.mmfinalproject.R.id.switchKannada)
        val viewPager = findViewById<ViewPager2>(com.example.mmfinalproject.R.id.heroViewPager)

        adapter = HeroPagerAdapter(heroes, isKannada)
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                currentIndex = position
            }
        })

        switchKannada.setOnCheckedChangeListener { _, checked ->
            isKannada = checked
            adapter.updateLanguage(isKannada)
        }

        findViewById<Button>(com.example.mmfinalproject.R.id.btnReadAloud).setOnClickListener {
            readCurrentHero()
        }

        findViewById<Button>(com.example.mmfinalproject.R.id.btnTakeQuiz).setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("district", district)
            intent.putExtra("heroName", heroes[currentIndex].name)
            startActivity(intent)
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            textToSpeech.language = Locale.US
        }
    }

    private fun readCurrentHero() {
        val hero = heroes[currentIndex]

        val text = if (isKannada) {
            "${hero.nameKannada}. ${hero.detailsKannada}"
        } else {
            "${hero.name}. ${hero.details}"
        }

        val locale = if (isKannada) {
            Locale("kn", "IN")
        } else {
            Locale.US
        }

        val result = textToSpeech.setLanguage(locale)

        if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
            Toast.makeText(this, "This language is not supported on this device", Toast.LENGTH_SHORT).show()
            return
        }

        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, "hero_reader")
    }

    override fun onDestroy() {
        textToSpeech.stop()
        textToSpeech.shutdown()
        super.onDestroy()
    }
}
