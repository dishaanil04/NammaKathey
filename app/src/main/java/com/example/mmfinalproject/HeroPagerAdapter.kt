package com.example.mmfinalproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeroPagerAdapter(
    private val heroes: List<HeroInfo>,
    private var isKannada: Boolean
) : RecyclerView.Adapter<HeroPagerAdapter.HeroViewHolder>() {

    class HeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtDistrict: TextView = view.findViewById(com.example.mmfinalproject.R.id.txtDistrict)
        val txtHeroName: TextView = view.findViewById(com.example.mmfinalproject.R.id.txtHeroName)
        val txtHeroDetails: TextView = view.findViewById(com.example.mmfinalproject.R.id.txtHeroDetails)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(com.example.mmfinalproject.R.layout.item_hero_page, parent, false)
        return HeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val hero = heroes[position]

        if (isKannada) {
            holder.txtDistrict.text = hero.districtKannada
            holder.txtHeroName.text = hero.nameKannada
            holder.txtHeroDetails.text = hero.detailsKannada
        } else {
            holder.txtDistrict.text = hero.district
            holder.txtHeroName.text = hero.name
            holder.txtHeroDetails.text = hero.details
        }
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    fun updateLanguage(kannada: Boolean) {
        isKannada = kannada
        notifyDataSetChanged()
    }
}
