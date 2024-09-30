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

public val Skip_previous: ImageVector get() {
        if (_Skip_previous != null) {
            return _Skip_previous!!
        }
        _Skip_previous = ImageVector.Builder(
            name = "Skip_previous",
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
                moveTo(220f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(520f, 0f)
                lineTo(380f, 480f)
                lineToRelative(360f, -240f)
                close()
                moveToRelative(-80f, -150f)
                verticalLineToRelative(-180f)
                lineToRelative(-136f, 90f)
                close()
            }
        }.build()
        return _Skip_previous!!
    }

private var _Skip_previous: ImageVector? = null

@Composable
fun SkipPreviousFAB() {
    FloatingActionButton(
        shape = FloatingActionButtonDefaults.largeShape,
        onClick = {},
        content = {
            Icon(
                Skip_previous,
                contentDescription = "play floating action button",
                modifier = Modifier.size(35.dp)
            )
        }
    )
}