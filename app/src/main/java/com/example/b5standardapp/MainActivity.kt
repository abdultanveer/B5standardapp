package com.example.b5standardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMessage:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMessage = findViewById(R.id.tvMsg) //taking handle

       // var data = intent.getStringExtra("nkey")
    }

    fun handleClick(view: View) {
        tvMessage.text = "button signinn was clicked"
        var hIntent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("nkey","abdul")
        startActivity(hIntent)
    //kotlinn is typeless --  infer the datatype
        //Intent hIntent = new Intent()

    }
}