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
        add(10,20)
        throw NullPointerException("demo  exception")
      /*  var hIntent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("nkey","abdul")
        startActivity(hIntent)*/
    //kotlinn is typeless --  infer the datatype
        //Intent hIntent = new Intent()

    }

    private fun add(i: Int, i1: Int) :Int{
        var d  = i + 30

        return i1 + i

    }
}