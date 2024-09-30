package io.github.amplifystudios.amplifyui.buttons.floatingActionButtons

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
import io.github.amplifystudios.amplifyui.buttons.iconButtons.RepeatIconButton

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

public val Pause: ImageVector get() {
        if (_Pause != null) {
            return _Pause!!
        }
        _Pause = ImageVector.Builder(
            name = "Pause",
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
                moveTo(520f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-320f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(400f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-320f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        return _Pause!!
    }

private var _Pause: ImageVector? = null

public val Play_arrow: ImageVector get() {
        if (_Play_arrow != null) {
            return _Play_arrow!!
        }
        _Play_arrow = ImageVector.Builder(
            name = "Play_arrow",
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
                moveTo(320f, 760f)
                verticalLineToRelative(-560f)
                lineToRelative(440f, 280f)
                close()
                moveToRelative(80f, -146f)
                lineToRelative(210f, -134f)
                lineToRelative(-210f, -134f)
                close()
            }
        }.build()
        return _Play_arrow!!
    }

private var _Play_arrow: ImageVector? = null

@Composable
fun PlayFAB() {
    var playChecked by remember {
        mutableStateOf(true)
    }

    FloatingActionButton(
        modifier = Modifier.size(70.dp),
        shape = FloatingActionButtonDefaults.largeShape,
        onClick = {
            playChecked = !playChecked
        },
        content = {
            if (playChecked) {
                Icon(
                    Play_arrow,
                    contentDescription = "play floating action button",
                    modifier = Modifier.size(35.dp)
                )
            } else {
                Icon(
                    Pause,
                    contentDescription = "pause floating action button",
                    modifier = Modifier.size(35.dp)
                )
            }
        }
    )
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun PlayerScreenPreview() {
    Scaffold(
        bottomBar = {
            Card(
                modifier = Modifier
                    .padding(10.dp, 20.dp)
                    .fillMaxWidth()
                    .height(100.dp),
                content = {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RepeatIconButton()
                        Spacer(modifier = Modifier.padding(10.dp, 0.dp))
                        SkipPreviousFAB()
                        Spacer(modifier = Modifier.padding(12.dp, 0.dp))
                        PlayFAB()
                        Spacer(modifier = Modifier.padding(12.dp, 0.dp))
                        SkipNextFAB()
                        Spacer(modifier = Modifier.padding(10.dp, 0.dp))
                        RepeatIconButton()
                    }
                }
            )
        }
    ) {

    }
}
