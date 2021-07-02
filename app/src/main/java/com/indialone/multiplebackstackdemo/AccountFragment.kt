package com.indialone.multiplebackstackdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.indialone.multiplebackstackdemo.databinding.FragmentAccountBinding

class AccountFragment : Fragment(R.layout.fragment_account) {

    private lateinit var mBinding: FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentAccountBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sendingAbout = "This is about my self . I am Sherlock Holmes a consultant detective."

        mBinding.btnAbout.setOnClickListener {
            val bundle = bundleOf(
                "about" to sendingAbout
            )
//            findNavController().navigate(
//                AccountFragmentDirections.actionAccountFragmentToAboutFragment()
//            )
            Navigation.findNavController(view)
                .navigate(R.id.action_accountFragment_to_aboutFragment, bundle)
        }

    }


}