package com.zf.kotlinplay

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator
 * on 2018/4/20 0020.
 * describe：
 */
class MyAdapter(val items:List<String>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textView?.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        return ViewHolder(TextView(parent?.context))
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}