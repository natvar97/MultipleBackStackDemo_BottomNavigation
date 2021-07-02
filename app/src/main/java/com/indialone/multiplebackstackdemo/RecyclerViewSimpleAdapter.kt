package com.indialone.multiplebackstackdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewSimpleAdapter(
    private val context: Context,
    private val list: ArrayList<String>
) : RecyclerView.Adapter<RecyclerViewSimpleAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = list[position]
        holder.itemView.setOnClickListener {
            it.findNavController()
                .navigate(NotificationFragmentDirections.actionNotificationFragmentToHomeSecondFragment2())
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}