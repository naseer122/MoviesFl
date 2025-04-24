package com.vpn.touchvpn.moviesflix.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vpn.touchvpn.moviesflix.Adapters.HomeScreenAdapter
import com.vpn.touchvpn.moviesflix.Models.homescreenmovie
import com.vpn.touchvpn.moviesflix.R
import com.vpn.touchvpn.moviesflix.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {
    lateinit var binding : FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var FetaturedRV = view.findViewById<RecyclerView>(R.id.FeaturedRV)
        var ModelList = ArrayList<homescreenmovie> ()
        ModelList.add(homescreenmovie("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAgu-W1pqHzbnc3rwTxi13ARITgjFIN8oH-m-n6z5defji_Lfo3kslrwpFqgow3EE35sQ&usqp=CAU","Flowers1"))
        var FeaturedAdapter = HomeScreenAdapter(ModelList)
        var LayoutManager = LinearLayoutManager(requireContext())
        FetaturedRV.layoutManager = LayoutManager
        FetaturedRV.adapter = FeaturedAdapter

    }
}