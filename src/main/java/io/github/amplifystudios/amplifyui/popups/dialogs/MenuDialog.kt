package io.github.amplifystudios.amplifyui.popups.dialogs

import android.content.res.Resources
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.times
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

fun Int.emToDp(): Int {
    val density = Resources.getSystem().displayMetrics.density
    return (this * density).toInt()
}

private val heightTable = hashMapOf(
    1 to 52,
    2 to 38,
    3 to 33,
    4 to 30,
    5 to 26,
    6 to 28,
    7 to 27,
    8 to 27,
)

@Composable
fun MenuPopup(
    expanded: Boolean = true,
    onDismissRequest: () -> Unit,
    items: List<String> = listOf("Option 1", "Option 2", "Option 3"),
    onItemClick: (String) -> Unit
) {
    if (!expanded) return
    if (items.isEmpty() || items.size > 8){
        println("Item count of ${items.size} is not supported")
        return
    }

    Dialog(
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        ),
        onDismissRequest = onDismissRequest
    ) {
        val verticalPadding = 16.dp
        val totalHeight = (2*verticalPadding + heightTable[items.size]!!.dp) * items.size

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(totalHeight)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column {
                items.forEachIndexed { index, item ->
                    Text(
                        text = item,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onItemClick(item) }
                            .padding(vertical = verticalPadding, horizontal = 8.dp),
                        style = TextStyle(color = Color.White, fontSize = 4.em)
                    )
                    if (index < items.lastIndex) {
                        HorizontalDivider(
                            modifier = Modifier.padding(vertical = 0.dp),
                            color = Color.Gray.copy(alpha = 0.5f)
                        )
                    }
                }
            }
        }
    }
}