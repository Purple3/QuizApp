package com.purple3.quizapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RecyclerViewAdapter(private val listAdapterData: Array<String>) :
        RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    class ViewHolder(view_layout : View) : RecyclerView.ViewHolder(view_layout){
        var tv_topic  = view_layout.findViewById(R.id.tv_items) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // create a new view
        val view_layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_items_layout, parent, false) as View
        // set the view's size, margins, paddings and layout parameters

         return ViewHolder(view_layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.tv_topic.text = listAdapterData[position]
        holder.tv_topic.textSize = 35.0f

        holder.tv_topic.setOnClickListener(){

        }
    }

    override fun getItemCount(): Int = listAdapterData.size
}