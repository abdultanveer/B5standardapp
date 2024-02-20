package com.example.b5standardapp.ui.dashboard

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    lateinit var timer: CountDownTimer
    private  val _seconds = MutableLiveData<Int>() //int as an observable

    fun seconds():LiveData<Int>{
        return _seconds
    }

    fun startTimer(){
        timer = object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                var timeLeft = millisUntilFinished/1000
                _seconds.value = timeLeft.toInt()
            }

            override fun onFinish() {
                _seconds.value = 0
            }

        }.start()
    }



    var number = 0

    fun addNumber(){
        number++
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}