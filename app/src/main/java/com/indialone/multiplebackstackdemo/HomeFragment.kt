package com.indialone.multiplebackstackdemo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.indialone.multiplebackstackdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var mBinding: FragmentHomeBinding
    private lateinit var navController : NavController

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//
//
//        return mBinding.root
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding = FragmentHomeBinding.inflate(layoutInflater)

        navController = Navigation.findNavController(view)
        // Inflate the layout for this fragment

        mBinding.btnHome.setOnClickListener {
            navController.navigate(R.id.homeSecondFragment)
        }

    }




}