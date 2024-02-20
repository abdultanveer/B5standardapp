package com.example.b5standardapp

import android.app.Application
import com.example.b5standardapp.data.ItemRoomDatabase

class InventoryApplication:Application() {

    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }

}