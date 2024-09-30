package io.github.amplifystudios.amplifyui.buttons.iconButtons

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

public val Repeat_one: ImageVector get() {
        if (_Repeat_one != null) {
            return _Repeat_one!!
        }
        _Repeat_one = ImageVector.Builder(
            name = "Repeat_one",
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
                moveTo(460f, 600f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                close()
                moveTo(280f, 880f)
                lineTo(120f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 58f)
                lineToRelative(-62f, 62f)
                horizontalLineToRelative(406f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(274f)
                lineToRelative(62f, 62f)
                close()
                moveToRelative(-80f, -440f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(486f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -58f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -58f)
                lineToRelative(62f, -62f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        return _Repeat_one!!
    }

private var _Repeat_one: ImageVector? = null

public val Repeat: ImageVector get() {
        if (_Repeat != null) {
            return _Repeat!!
        }
        _Repeat = ImageVector.Builder(
            name = "Repeat",
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
                moveTo(280f, 880f)
                lineTo(120f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 58f)
                lineToRelative(-62f, 62f)
                horizontalLineToRelative(406f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(274f)
                lineToRelative(62f, 62f)
                close()
                moveToRelative(-80f, -440f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(486f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -58f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -58f)
                lineToRelative(62f, -62f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        return _Repeat!!
    }

private var _Repeat: ImageVector? = null

@Composable
fun RepeatIconButton() {
    var repeatOneChecked by remember {
        mutableStateOf(false)
    }

    IconButton(
        onClick = {
            repeatOneChecked = !repeatOneChecked
        },
        content = {
            if (repeatOneChecked) {
                Icon(
                    Repeat_one,
                    contentDescription = "repeat icon button",
                    modifier = Modifier.size(35.dp)
                )
            } else {
                Icon(
                    Repeat,
                    contentDescription = "repeat icon button",
                    modifier = Modifier.size(35.dp)
                )
            }
        }
    )
}

@Preview
@Composable
fun RepeatIconButtonPreview() {
    RepeatIconButton()
}
