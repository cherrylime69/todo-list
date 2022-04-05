package com.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var start = 0
    val max = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test1: Test1 = Test10()
        val test2: Test2 = test1 as Test2

        println()


    }

    fun count(text: TextView) {
        var start = 0
        text.text = "$start"
        CoroutineScope(Dispatchers.Default).launch {
            while (start < 5) {
                delay(1000L)
                start += 1
                CoroutineScope(Dispatchers.Main).launch {
                    text.text = "$start"
                }
            }
        }
    }

    /*fun countHandler(text: TextView) {
        var start = 0
        val max = System.currentTimeMillis() + 5000L

        while (start <= 5) {
            Handler(mainLooper).postDelayed( , 1000)
        }*/

}
