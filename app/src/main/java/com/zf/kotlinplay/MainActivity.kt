package com.zf.kotlinplay

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = "你好 kotlin"
        val recycle = findViewById<RecyclerView>(R.id.recycle) as RecyclerView
        val adapter = OneAdapter(this, initData()!!)
        val list : ArrayList<String>? = null
        for (i in 1..10){
            list?.add(i.toString())
        }
        recycle.layoutManager = LinearLayoutManager(this)
        recycle.adapter = adapter
    }

    private fun initData(): ArrayList<String>? {
        var list=ArrayList<String>()
        for (i in 0..10){
            list.add(i.toString())
        }
        return list
    }

}