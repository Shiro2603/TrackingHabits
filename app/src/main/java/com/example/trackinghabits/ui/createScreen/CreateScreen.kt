package com.example.trackinghabits.ui.createScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.trackinghabits.domain.model.Habit
import com.example.trackinghabits.ui.createScreen.viewModel.CreateViewModel
import org.koin.androidx.compose.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateScreen(
    navController: NavHostController
) {

    var habitName by remember { mutableStateOf("") }
    var habitDescription by remember { mutableStateOf("") }
    val viewModel: CreateViewModel = koinViewModel()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Создать привычку")
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = habitName,
                    onValueChange = { newText ->
                        habitName = newText
                    },
                    label = { Text(text = "Привычка") }
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = habitDescription,
                    onValueChange = { newText ->
                        habitDescription = newText
                    },
                    label = { Text(text = "Описание") }
                )
            }

            Spacer(
                modifier = Modifier.weight(1f)
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
                    .padding(horizontal = 10.dp),
                onClick = {
                    viewModel.addHabit(
                        Habit(
                            id = null,
                            habitName = habitName,
                            description = habitDescription
                        )
                    )
                    navController.popBackStack()
                }
            ) {
                Text(
                    text = "Создать"
                )
            }

        }
    }
}

//@Preview(showBackground = true)
//@Composable()
//private fun CreateScreenPreview() {
//    CreateScreen()
//}