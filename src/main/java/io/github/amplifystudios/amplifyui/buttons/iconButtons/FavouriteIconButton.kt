package io.github.amplifystudios.amplifyui.buttons.iconButtons

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FavouriteIconButton() {
    var favouriteChecked by remember {
        mutableStateOf(false)
    }

    IconButton(
        onClick = {
            favouriteChecked = !favouriteChecked
        },
        content = {
            if (favouriteChecked) {
                Icon(Icons.Filled.Favorite, "favourite icon button")
            } else {
                Icon(
                    Icons.Filled.FavoriteBorder,
                    "favourite icon button",
                    Modifier.size(35.dp)
                )
            }
        }
    )

}

@Preview
@Composable
fun FavouriteIconButtonPreview(){
    FavouriteIconButton()
}