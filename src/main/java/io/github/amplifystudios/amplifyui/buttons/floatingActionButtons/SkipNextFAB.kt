package io.github.amplifystudios.amplifyui.buttons.floatingActionButtons

import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Skip_next: ImageVector get() {
        if (_Skip_next != null) {
            return _Skip_next!!
        }
        _Skip_next = ImageVector.Builder(
            name = "Skip_next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(660f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(-440f, 0f)
                verticalLineToRelative(-480f)
                lineToRelative(360f, 240f)
                close()
                moveToRelative(80f, -150f)
                lineToRelative(136f, -90f)
                lineToRelative(-136f, -90f)
                close()
            }
        }.build()
        return _Skip_next!!
    }

private var _Skip_next: ImageVector? = null

@Composable
fun SkipNextFAB() {
    FloatingActionButton(
        shape = FloatingActionButtonDefaults.largeShape,
        onClick = {},
        content = {
            Icon(
                Skip_next,
                contentDescription = "play floating action button",
                modifier = Modifier.size(35.dp)
            )
        }
    )
}