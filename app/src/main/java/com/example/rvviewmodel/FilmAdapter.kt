package com.example.rvviewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class FilmAdapter(var listFilm : ArrayList<DataFilm>):RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var img = view.findViewById<ImageView>(R.id.filmImg)
        var judul = view.findViewById<TextView>(R.id.judulFilm)
        var tgl = view.findViewById<TextView>(R.id.tglFilm)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listFilm[position]
        holder.img.setImageResource(data.img)
        holder.judul.setText(data.judul)
        holder.tgl.setText(data.tanggal)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    fun setFilmData (listFilm: ArrayList<DataFilm>){
        this.listFilm = listFilm
    }

}