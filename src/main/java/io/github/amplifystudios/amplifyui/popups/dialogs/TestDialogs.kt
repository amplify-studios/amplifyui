package io.github.amplifystudios.amplifyui.popups.dialogs

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun TestPopups(){
    val openAlertDialog = remember { mutableStateOf(false) }
    val openDefaultDialog = remember { mutableStateOf(false) }
    val openMenuDialog = remember { mutableStateOf(false) }

    when {
        openAlertDialog.value -> {
            AlertDialog(
                onDismissRequest = { openAlertDialog.value = false },
                onConfirmation = {
                    openAlertDialog.value = false
                    println("Confirmation registered") // Add logic here to handle confirmation.
                },
                dialogTitle = "Alert Dialog",
                dialogText = "This is an example of an alert dialog with buttons.",
                icon = Icons.Default.Info
            )
        }
        openDefaultDialog.value -> {
            DefaultPopup(
                dialogText = "This is an example of an alert dialog.",
                dialogTitle = "Default Dialog",
                onDismissRequest = {
                    openDefaultDialog.value = false
                }
            )
        }
        openMenuDialog.value -> {
            MenuPopup(
                items = listOf("Option 1", "Option 2", "Option 3", "Option 4", "Option 5", "Option 6", "Option 7", "Option 8"),
                onDismissRequest = {openMenuDialog.value = false},
                onItemClick = { item ->
                    println(item)
                }
            )
        }
    }

    Column {
        Button(onClick = {
            openDefaultDialog.value = true
        }) {
            Text(text = "Default")
        }
        Button(onClick = {
            openMenuDialog.value = true
        }) {
            Text(text = "Menu")
        }
        Button(onClick = {
            openAlertDialog.value = true
        }) {
            Text(text = "Alert")
        }

    }


}