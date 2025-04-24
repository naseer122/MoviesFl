package com.vpn.touchvpn.moviesflix.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vpn.touchvpn.moviesflix.Models.homescreenmovie
import com.vpn.touchvpn.moviesflix.R

class HomeScreenAdapter(var HomeScreenMovieList: ArrayList<homescreenmovie>) :
    RecyclerView.Adapter<HomeScreenAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.featured_row_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        Glide.with(holder.itemView.context).load(HomeScreenMovieList[position].ImgUrl)
            .into(holder.MovieIV)
        holder.MovieTV.text = HomeScreenMovieList[position].Title
    }

    override fun getItemCount(): Int {
        return HomeScreenMovieList.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var MovieIV = itemView.findViewById<ImageView>(R.id.MovieIV)
        var MovieTV = itemView.findViewById<TextView>(R.id.MovieTV)
    }
}