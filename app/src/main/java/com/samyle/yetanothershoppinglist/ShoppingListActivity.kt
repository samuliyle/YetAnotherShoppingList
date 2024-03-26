package com.samyle.yetanothershoppinglist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.samyle.yetanothershoppinglist.compose.ShoppingListApp
import com.samyle.yetanothershoppinglist.ui.theme.YetAnotherShoppingListTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            YetAnotherShoppingListTheme {
                ShoppingListApp()
            }
        }
    }
}