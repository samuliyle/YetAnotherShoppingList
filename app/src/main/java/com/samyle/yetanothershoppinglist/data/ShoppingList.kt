package com.samyle.yetanothershoppinglist.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_lists")
data class ShoppingList(
    @PrimaryKey(autoGenerate = true) val id: Int, val name: String
)
