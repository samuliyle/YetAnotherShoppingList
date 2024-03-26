package com.samyle.yetanothershoppinglist.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.samyle.yetanothershoppinglist.compose.list.ListScreen

@Composable
fun ShoppingListApp() {
    val navController = rememberNavController()
    ShoppingListAppNavHost(
        navController = navController
    )
}

@Composable
fun ShoppingListAppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.ShoppingLists.route) {
        composable(route = Screen.ShoppingLists.route) {
            ListScreen()
        }
    }
}