package io.github.amplifystudios.amplifyui.popups.dialogs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun DefaultPopup(
    expanded: Boolean = true,
    dialogText: String,
    dialogTitle: String,
    icon: ImageVector? = Icons.Default.Notifications,
    onDismissRequest: () -> Unit,
) {
    if (!expanded) return

    AlertDialog(
        icon = {
            icon?.let { Icon(it, contentDescription = "Alert Icon") }
        },
        title = {
            Text(text = dialogTitle)
        },
        text = {
            Text(text = dialogText)
        },
        onDismissRequest = {
            onDismissRequest()
        },
        confirmButton = {},
        dismissButton = {}
    )

}