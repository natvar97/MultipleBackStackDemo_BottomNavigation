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
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.multiplebackstackdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var mBinding: FragmentHomeBinding
    private lateinit var navController: NavController

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        mBinding = FragmentHomeBinding.inflate(inflater , container , false)
//        return mBinding.root
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding = FragmentHomeBinding.inflate(layoutInflater)

        navController = Navigation.findNavController(view)

        mBinding.btnHome.setOnClickListener{
            navController.navigate(R.id.action_HomeFragment_to_homeSecondFragment)
        }

//        val list = arrayListOf<String>(
//            "one",
//            "two",
//            "three",
//            "four",
//            "five",
//            "six",
//            "seven",
//            "eight",
//            "nine",
//            "ten"
//        )
//
//        mBinding.recyclerview.layoutManager = LinearLayoutManager(view.context)
//        mBinding.recyclerview.adapter = RecyclerViewSimpleAdapter(view.context , list)



    }


}