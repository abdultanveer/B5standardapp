package com.example.b5standardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var tvMessage:TextView
    lateinit var recyclerView: RecyclerView

    var countries = arrayOf("india","australia","uk","usa","india","australia","uk","usa")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //layout inflater xml activity_main
        setContentView(R.layout.activity_main)
        tvMessage = findViewById(R.id.tvMsg) //taking handle
        recyclerView = findViewById(R.id.recyclerView)

       // var data = intent.getStringExtra("nkey")
    }


    override fun onStart() {
        super.onStart()
        var adapter = CountriesAdapter(countries)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
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