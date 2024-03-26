package com.samyle.yetanothershoppinglist.compose.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.samyle.yetanothershoppinglist.data.ShoppingList
import com.samyle.yetanothershoppinglist.viewmodels.ShoppingListViewModel

@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingListViewModel = hiltViewModel()
) {
    val shoppingLists by viewModel.shoppingLists.collectAsState(initial = emptyList())
    ListScreen(shoppingLists, modifier)
}

@Composable
fun ListScreen(shoppingLists: List<ShoppingList>, modifier: Modifier = Modifier) {
    if (shoppingLists.isEmpty()) {
        EmptyList(modifier)
    } else {
        ShoppingListCardList(shoppingLists, modifier)
    }
}

@Composable
private fun ShoppingListCardList(shoppingLists: List<ShoppingList>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(shoppingLists) { shoppingList ->
            ShoppingListCard(
                shoppingList = shoppingList,
                modifier
            )
        }
    }
}

@Composable
private fun ShoppingListCard(shoppingList: ShoppingList, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(Modifier.fillMaxWidth()) {
            Text(
                text = shoppingList.name,
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

@Composable
private fun EmptyList(modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = "No lists",
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

