package com.zf.kotlinplay

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator
 * on 2018/4/26 0026.
 * describe：
 */
class OneAdapter(val context:Context, val list: ArrayList<String>) : RecyclerView.Adapter<OneAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view:View = LayoutInflater.from(context).inflate(R.layout.list_item_support,parent,false)
        val holder = MyViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder?.tv_name?.text = list[position]
    }


    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tv_name:TextView = view.findViewById(R.id.tv_name)

    }

}


