package com.example.b5standardapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CountriesAdapter(var countries: Array<String>) : RecyclerView.Adapter<CountriesAdapter.CountriesHolder>() {
    var TAG = CountriesAdapter::class.java.simpleName

    class CountriesHolder(itemView: View): ViewHolder(itemView) {
        var tvRowItem = itemView.findViewById<TextView>(R.id.tvRow)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesHolder {
        Log.i(TAG,"ranjit  bought a row plank")
        //inflation -- parse xml file and  create its correspondinng memory vars
        var rowPlank = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return  CountriesHolder(rowPlank)


    }

    override fun getItemCount(): Int {
        Log.i(TAG,"niti  count =" + countries.size)
        return  countries.size
    }

    override fun onBindViewHolder(holder: CountriesHolder, position: Int) {
        Log.i(TAG,"priyan is writing--"+ countries[position])
        holder.tvRowItem.setText(countries[position])
    }
}