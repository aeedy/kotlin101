package com.example.aeedy.chapter1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extra = intent.extras
        if(extra != null) {
            val textshow = findViewById<TextView>(R.id.txtIntent)
            textshow.text = extra.getString("position_code") + " : " + extra.getString("position_name")
        }


    }
}
