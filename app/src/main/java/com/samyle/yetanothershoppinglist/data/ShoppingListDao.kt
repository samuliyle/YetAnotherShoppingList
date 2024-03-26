package com.samyle.yetanothershoppinglist.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingListDao {
    @Query("SELECT * FROM shopping_lists")
    fun getAll(): Flow<List<ShoppingList>>
}