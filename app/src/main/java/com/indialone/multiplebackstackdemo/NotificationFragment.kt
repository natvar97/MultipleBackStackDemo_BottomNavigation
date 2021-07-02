package com.indialone.multiplebackstackdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.multiplebackstackdemo.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment(R.layout.fragment_notification) {

    private lateinit var mBinding: FragmentNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentNotificationBinding.inflate(inflater, container, false)

        return mBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        createRecyclerView()

    }

    fun createRecyclerView() {

        val list = arrayListOf<String>(
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
            "ten",
        )

        mBinding.recyclerview.layoutManager = LinearLayoutManager(mBinding.root.context)
        mBinding.recyclerview.adapter = RecyclerViewSimpleAdapter(mBinding.root.context, list)

    }

}