package com.zf.kotlinplay

import android.util.Log
import java.net.URL

/**
 * Created by Administrator
 * on 2018/4/25 0025.
 * describe：
 */
public class Request(val url:String){

    public fun run(){
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName,forecastJsonStr)
    }
}