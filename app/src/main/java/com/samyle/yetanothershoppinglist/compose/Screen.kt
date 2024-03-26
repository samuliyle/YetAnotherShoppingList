package com.samyle.yetanothershoppinglist.compose

sealed class Screen(val route: String) {
    data object ShoppingLists : Screen("shoppingLists")
}