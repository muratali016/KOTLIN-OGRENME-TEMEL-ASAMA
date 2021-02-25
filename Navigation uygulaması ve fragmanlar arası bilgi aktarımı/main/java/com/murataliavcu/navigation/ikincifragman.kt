package com.murataliavcu.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ikincifragman.*
import kotlinx.android.synthetic.main.fragment_ilkfragman.*


class ikincifragman : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ikincifragman, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
arguments.let {
    val isim = it?.let { it1 -> ikincifragmanArgs.fromBundle(it1).kullanCAd }
    ikincifragmantexti.text =isim
}

        sıradakibutobfragman2.setOnClickListener {
            val action = ikincifragmanDirections.actionİkincifragmanToİlkfragman()
            Navigation.findNavController(it).navigate(action)

        }
    }
}