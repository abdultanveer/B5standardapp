package com.example.b5standardapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class ItemRoomDatabase : RoomDatabase(){
    abstract fun itemDao(): ItemDao

    //companion -- static in java
    companion object{

        @Volatile
        private var INSTANCE: ItemRoomDatabase? = null

        fun getDatabase(context: Context): ItemRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext,
                    ItemRoomDatabase::class.java,
                "items_db")
                    .fallbackToDestructiveMigration()
                    .build()
                return instance
            }
            }

        }

}