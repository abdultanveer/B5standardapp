package com.example.b5standardapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Query("SELECT * from item WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

   /* @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)



    @Query("SELECT * from item ORDER BY itemName ASC")
    fun getItems(): Flow<List<Item>>*/

}