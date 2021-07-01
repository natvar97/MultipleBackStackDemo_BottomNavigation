package com.indialone.multiplebackstackdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.indialone.multiplebackstackdemo.databinding.FragmentHomeSecondBinding

class HomeSecondFragment : Fragment(R.layout.fragment_home_second) {

    private lateinit var mBinding: FragmentHomeSecondBinding

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        mBinding = FragmentHomeSecondBinding.inflate(inflater, container, false)
//
//
//        return mBinding.root
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding = FragmentHomeSecondBinding.inflate(layoutInflater)

    }

}