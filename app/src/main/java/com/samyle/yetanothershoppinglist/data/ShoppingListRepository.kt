package com.samyle.yetanothershoppinglist.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ShoppingListRepository @Inject constructor(private val shoppingListDao: ShoppingListDao) {

    fun getShoppingLists(): Flow<List<ShoppingList>> = shoppingListDao.getAll()

    companion object {
        @Volatile
        private var instance: ShoppingListRepository? = null

        fun getInstance(shoppingListDao: ShoppingListDao) = instance ?: synchronized(this) {
            instance ?: ShoppingListRepository(shoppingListDao).also { instance = it }
        }
    }
}