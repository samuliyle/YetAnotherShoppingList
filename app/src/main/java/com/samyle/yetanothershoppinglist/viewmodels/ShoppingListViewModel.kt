package com.samyle.yetanothershoppinglist.viewmodels

import androidx.lifecycle.ViewModel
import com.samyle.yetanothershoppinglist.data.ShoppingList
import com.samyle.yetanothershoppinglist.data.ShoppingListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ShoppingListViewModel @Inject internal constructor(shoppingListRepository: ShoppingListRepository) :
    ViewModel() {
    val shoppingLists: Flow<List<ShoppingList>> = shoppingListRepository.getShoppingLists()
}