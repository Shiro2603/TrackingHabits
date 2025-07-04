package com.example.trackinghabits.ui.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.trackinghabits.ui.homeScreen.viewModel.HomeViewModel
import org.koin.androidx.compose.koinViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onAddHabit: () -> Unit
) {
    val viewModel: HomeViewModel = koinViewModel()
    val homeScreenUi by viewModel.screenState.observeAsState()
    viewModel.getAllHabits()


    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(text = "Главная") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onAddHabit
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
        }

    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            when (val state = homeScreenUi) {
                is HomeScreenUi.Content -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 15.dp)
                    ) {
                        items(state.habit) {
                            HabitsView(it)
                        }
                    }
                } is HomeScreenUi.Empty -> {

                } else -> {}
            }
        }
    }
}

