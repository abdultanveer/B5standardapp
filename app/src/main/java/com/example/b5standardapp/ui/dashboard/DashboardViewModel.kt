package com.example.b5standardapp.ui.dashboard

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.b5standardapp.data.Item
import com.example.b5standardapp.data.ItemDao
import kotlinx.coroutines.launch

class DashboardViewModel(private val itemDao: ItemDao) : ViewModel() {
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

     fun insertData(item: Item) {
         viewModelScope.launch {

             itemDao.insert(item)
         }
    }

    fun retrieveItem(id: Int): LiveData<Item> {
        return itemDao.getItem(id).asLiveData()

    }

/*    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text*/



}

class InventoryViewModelFactory(private val itemDao: ItemDao) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DashboardViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DashboardViewModel(itemDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")    }
}