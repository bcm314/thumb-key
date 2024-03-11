package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.KeyboardReturn
import androidx.compose.material.icons.automirrored.outlined.LastPage
import androidx.compose.material.icons.automirrored.outlined.Redo
import androidx.compose.material.icons.automirrored.outlined.Undo
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.ContentCopy
import androidx.compose.material.icons.outlined.ContentCut
import androidx.compose.material.icons.outlined.ContentPaste
import androidx.compose.material.icons.outlined.FirstPage
import androidx.compose.material.icons.outlined.Keyboard
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material.icons.outlined.KeyboardCapslock
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowDown
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowUp
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.LinearScale
import androidx.compose.material.icons.outlined.Mic
import androidx.compose.material.icons.outlined.Mood
import androidx.compose.material.icons.outlined.PanToolAlt
import androidx.compose.material.icons.outlined.SelectAll
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SlideType
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_DE_MESSAGEEASE_SYMBOLS_DUMMY_KEY_ITEM___not_used___ =
    KeyItemC(
        center =
            KeyC(
                display = null,
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_ESCAPE,
                        ),
                    ),
                color = ColorVariant.SECONDARY,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_NUMERIC_KEY_ITEM___not_used___ =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.TextDisplay("123"),
                action = KeyAction.ToggleNumericMode(true),
                size = FontSizeVariant.SMALL,
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes =
            mapOf(
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                        action = KeyAction.Copy,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.TOP_LEFT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                        action = KeyAction.SelectAll,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.TOP_RIGHT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                        action = KeyAction.Cut,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.LEFT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Undo),
                        action = KeyAction.Undo,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Redo),
                        action = KeyAction.Redo,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                        action = KeyAction.Paste,
                        color = ColorVariant.MUTED,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_EMOJI_KEY_ITEM___not_used___ =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.PanToolAlt),
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_ESCAPE,
                        ),
                    ),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes =
            mapOf(
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                        action = KeyAction.GotoSettings,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.Keyboard),
                        action = KeyAction.SwitchIME,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM_LEFT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.Mic),
                        action = KeyAction.SwitchIMEVoice,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.LEFT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.Language),
                        action = KeyAction.SwitchLanguage,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.LinearScale),
                        action = KeyAction.SwitchPosition,
                        color = ColorVariant.MUTED,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_RETURN_KEY_ITEM___not_used___ =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                action = KeyAction.IMECompleteAction,
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
        swipes =
            mapOf(
                SwipeDirection.TOP_LEFT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.Mood),
                        action = KeyAction.ToggleEmojiMode(true),
                        color = ColorVariant.SECONDARY,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_BIG_DIRECTIONS =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.TextDisplay(""),
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_PAGE_DOWN,
                        ),
                    ),
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes =
            mapOf(
                SwipeDirection.TOP_LEFT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F7"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F7,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.TOP_RIGHT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F8"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F8,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowUp),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_PAGE_UP,
                                ),
                            ),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.LEFT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.FirstPage),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_MOVE_HOME,
                                ),
                            ),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.LastPage),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_MOVE_END,
                                ),
                            ),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardDoubleArrowDown),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_PAGE_DOWN,
                                ),
                            ),
                        size = FontSizeVariant.LARGE,
                        color = ColorVariant.MUTED,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_SPACEBAR_KEY_ITEM =
    KeyItemC(
        longPress = KeyAction.CommitText("0"),
        center =
            KeyC(
                display = KeyDisplay.TextDisplay(" "),
                action = KeyAction.CommitText(" "),
            ),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        swipes =
            mapOf(
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowUp),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_DPAD_UP,
                                ),
                            ),
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowDown),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_DPAD_DOWN,
                                ),
                            ),
                    ),
                SwipeDirection.LEFT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardArrowLeft),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_DPAD_LEFT,
                                ),
                            ),
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardArrowRight),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_DPAD_RIGHT,
                                ),
                            ),
                    ),
            ),
        nextTapActions =
            listOf(
                KeyAction.ReplaceLastText(", ", trimCount = 1),
                KeyAction.ReplaceLastText(". "),
                KeyAction.ReplaceLastText("? "),
                KeyAction.ReplaceLastText("! "),
                KeyAction.ReplaceLastText(": "),
                KeyAction.ReplaceLastText("; "),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_F5_KEY_ITEM =
    KeyItemC(
        longPress =
            KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_F11,
                ),
            ),
        center =
            KeyC(
                display = KeyDisplay.TextDisplay("F5"),
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_F5,
                        ),
                    ),
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes =
            mapOf(
                SwipeDirection.TOP_LEFT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F1"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F1,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F2"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F2,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.TOP_RIGHT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F3"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F3,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.LEFT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F4"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F4,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.RIGHT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F6"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F6,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM_LEFT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F9"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F9,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F10"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F10,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM_RIGHT to
                    KeyC(
                        display = KeyDisplay.TextDisplay("F12"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_F12,
                                ),
                            ),
                        color = ColorVariant.MUTED,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_CTRL_KEY_ITEM =
    KeyItemC(
        longPress =
            KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_CTRL_LEFT,
                ),
            ),
        center =
            KeyC(
                display = KeyDisplay.TextDisplay("CTRL"),
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_UP,
                            KeyEvent.KEYCODE_CTRL_LEFT,
                        ),
                    ),
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes =
            mapOf(
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.TextDisplay("up"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_UP,
                                    KeyEvent.KEYCODE_CTRL_LEFT,
                                ),
                            ),
                        size = FontSizeVariant.SMALLEST,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.TextDisplay("down"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_CTRL_LEFT,
                                ),
                            ),
                        size = FontSizeVariant.SMALLEST,
                        color = ColorVariant.MUTED,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_SHIFT_KEY_ITEM =
    KeyItemC(
        longPress =
            KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent.KEYCODE_SHIFT_LEFT,
                ),
            ),
        center =
            KeyC(
                display = KeyDisplay.TextDisplay("SHIFT"),
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_UP,
                            KeyEvent.KEYCODE_SHIFT_LEFT,
                        ),
                    ),
                color = ColorVariant.SECONDARY,
            ),
        swipeType = SwipeNWay.EIGHT_WAY,
        swipes =
            mapOf(
                SwipeDirection.TOP to
                    KeyC(
                        display = KeyDisplay.TextDisplay("up"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_UP,
                                    KeyEvent.KEYCODE_SHIFT_LEFT,
                                ),
                            ),
                        size = FontSizeVariant.SMALLEST,
                        color = ColorVariant.MUTED,
                    ),
                SwipeDirection.BOTTOM to
                    KeyC(
                        display = KeyDisplay.TextDisplay("down"),
                        action =
                            KeyAction.SendEvent(
                                KeyEvent(
                                    KeyEvent.ACTION_DOWN,
                                    KeyEvent.KEYCODE_SHIFT_LEFT,
                                ),
                            ),
                        size = FontSizeVariant.SMALLEST,
                        color = ColorVariant.MUTED,
                    ),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
    )

val KB_DE_MESSAGEEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_F5_KEY_ITEM,
                KeyItemC(
                    longPress = KeyAction.CommitText("1"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("a"),
                            action = KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("$"),
                                    action = KeyAction.CommitText("$"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ä"),
                                    action = KeyAction.CommitText("ä"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("v"),
                                    action = KeyAction.CommitText("v"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = null,
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_CTRL_LEFT,
                                            ),
                                        ),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = null,
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_SHIFT_LEFT,
                                            ),
                                        ),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = null,
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_ALT_LEFT,
                                            ),
                                        ),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("2"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("n"),
                            action = KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("`"),
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("+"),
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("l"),
                                    action = KeyAction.CommitText("l"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("´"),
                                    action = KeyAction.CommitText("´"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("3"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("i"),
                            action = KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("x"),
                                    action = KeyAction.CommitText("x"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("="),
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("€"),
                                    action = KeyAction.CommitText("€"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowUp),
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_DPAD_UP,
                                            ),
                                        ),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_CTRL_KEY_ITEM,
                KeyItemC(
                    longPress = KeyAction.CommitText("4"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("h"),
                            action = KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ü"),
                                    action = KeyAction.CommitText("ü"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ö"),
                                    action = KeyAction.CommitText("ö"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("_"),
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("k"),
                                    action = KeyAction.CommitText("k"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("5"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("d"),
                            action = KeyAction.CommitText("d"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("u"),
                                    action = KeyAction.CommitText("u"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("q"),
                                    action = KeyAction.CommitText("q"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("c"),
                                    action = KeyAction.CommitText("c"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("g"),
                                    action = KeyAction.CommitText("g"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("o"),
                                    action = KeyAction.CommitText("o"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("j"),
                                    action = KeyAction.CommitText("j"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("b"),
                                    action = KeyAction.CommitText("b"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("p"),
                                    action = KeyAction.CommitText("p"),
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("6"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("r"),
                            action = KeyAction.CommitText("r"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    size = FontSizeVariant.LARGE,
                                    action = KeyAction.ToggleShiftMode(true),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("|"),
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("m"),
                                    action = KeyAction.CommitText("m"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("]"),
                                    action = KeyAction.CommitText("]"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("}"),
                                    action = KeyAction.CommitText("}"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_SHIFT_KEY_ITEM,
                KeyItemC(
                    longPress = KeyAction.CommitText("7"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("t"),
                            action = KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("~"),
                                    action = KeyAction.CommitText("~"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ß"),
                                    action = KeyAction.CommitText("ß"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("y"),
                                    action = KeyAction.CommitText("y"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇥"),
                                    action = KeyAction.CommitText("\t"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("8"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("e"),
                            action = KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("w"),
                                    action = KeyAction.CommitText("w"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("z"),
                                    action = KeyAction.CommitText("z"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("9"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("s"),
                            action = KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("f"),
                                    action = KeyAction.CommitText("f"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("°"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowDown),
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_DPAD_DOWN,
                                            ),
                                        ),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_BIG_DIRECTIONS,
                KB_DE_MESSAGEEASE_SYMBOLS_SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_MESSAGEEASE_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_F5_KEY_ITEM,
                KeyItemC(
                    longPress = KeyAction.CommitText("1"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("A"),
                            action = KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("$"),
                                    action = KeyAction.CommitText("$"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ä"),
                                    action = KeyAction.CommitText("Ä"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("V"),
                                    action = KeyAction.CommitText("V"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("2"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("N"),
                            action = KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("`"),
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("+"),
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("L"),
                                    action = KeyAction.CommitText("L"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("´"),
                                    action = KeyAction.CommitText("´"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("3"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("I"),
                            action = KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("X"),
                                    action = KeyAction.CommitText("X"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("="),
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("€"),
                                    action = KeyAction.CommitText("€"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowUp),
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_DPAD_UP,
                                            ),
                                        ),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_CTRL_KEY_ITEM,
                KeyItemC(
                    longPress = KeyAction.CommitText("4"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("H"),
                            action = KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ü"),
                                    action = KeyAction.CommitText("Ü"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Ö"),
                                    action = KeyAction.CommitText("Ö"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("_"),
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("K"),
                                    action = KeyAction.CommitText("K"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("5"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("D"),
                            action = KeyAction.CommitText("D"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("U"),
                                    action = KeyAction.CommitText("U"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Q"),
                                    action = KeyAction.CommitText("Q"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("C"),
                                    action = KeyAction.CommitText("C"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("G"),
                                    action = KeyAction.CommitText("G"),
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("O"),
                                    action = KeyAction.CommitText("O"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("J"),
                                    action = KeyAction.CommitText("J"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("B"),
                                    action = KeyAction.CommitText("B"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("P"),
                                    action = KeyAction.CommitText("P"),
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("6"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("R"),
                            action = KeyAction.CommitText("R"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                                    capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                                    size = FontSizeVariant.LARGE,
                                    action = KeyAction.ToggleCapsLock,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("|"),
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("M"),
                                    action = KeyAction.CommitText("M"),
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                                    size = FontSizeVariant.LARGE,
                                    action = KeyAction.ToggleShiftMode(false),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("]"),
                                    action = KeyAction.CommitText("]"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("}"),
                                    action = KeyAction.CommitText("}"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_SHIFT_KEY_ITEM,
                KeyItemC(
                    longPress = KeyAction.CommitText("7"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("T"),
                            action = KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("~"),
                                    action = KeyAction.CommitText("~"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("ẞ"),
                                    action = KeyAction.CommitText("ẞ"),
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Y"),
                                    action = KeyAction.CommitText("Y"),
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇥"),
                                    action = KeyAction.CommitText("\t"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("8"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("E"),
                            action = KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("W"),
                                    action = KeyAction.CommitText("W"),
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("Z"),
                                    action = KeyAction.CommitText("Z"),
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    longPress = KeyAction.CommitText("9"),
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("S"),
                            action = KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("F"),
                                    action = KeyAction.CommitText("F"),
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("°"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowDown),
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_DPAD_DOWN,
                                            ),
                                        ),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_BIG_DIRECTIONS,
                KB_DE_MESSAGEEASE_SYMBOLS_SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_MESSAGEEASE_SYMBOLS_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_F5_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("1"),
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("$"),
                                    action = KeyAction.CommitText("$"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("-"),
                                    action = KeyAction.CommitText("-"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("2"),
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("`"),
                                    action = KeyAction.CommitText("`"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("^"),
                                    action = KeyAction.CommitText("^"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("´"),
                                    action = KeyAction.CommitText("´"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("!"),
                                    action = KeyAction.CommitText("!"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\\"),
                                    action = KeyAction.CommitText("\\"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("/"),
                                    action = KeyAction.CommitText("/"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("+"),
                                    action = KeyAction.CommitText("+"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("3"),
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("?"),
                                    action = KeyAction.CommitText("?"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("€"),
                                    action = KeyAction.CommitText("€"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("="),
                                    action = KeyAction.CommitText("="),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowUp),
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_DPAD_UP,
                                            ),
                                        ),
                                ),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_CTRL_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("4"),
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("{"),
                                    action = KeyAction.CommitText("{"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("%"),
                                    action = KeyAction.CommitText("%"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("_"),
                                    action = KeyAction.CommitText("_"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("["),
                                    action = KeyAction.CommitText("["),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("("),
                                    action = KeyAction.CommitText("("),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("5"),
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("6"),
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("|"),
                                    action = KeyAction.CommitText("|"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("}"),
                                    action = KeyAction.CommitText("}"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(")"),
                                    action = KeyAction.CommitText(")"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("]"),
                                    action = KeyAction.CommitText("]"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("@"),
                                    action = KeyAction.CommitText("@"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("ABC"),
                            action = KeyAction.ToggleNumericMode(false),
                            size = FontSizeVariant.SMALL,
                            color = ColorVariant.SECONDARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                                    action = KeyAction.Copy,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                                    action = KeyAction.SelectAll,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                                    action = KeyAction.Cut,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Undo),
                                    action = KeyAction.Undo,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.Redo),
                                    action = KeyAction.Redo,
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                                    action = KeyAction.Paste,
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_SHIFT_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("7"),
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("~"),
                                    action = KeyAction.CommitText("~"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("⇥"),
                                    action = KeyAction.CommitText("\t"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("*"),
                                    action = KeyAction.CommitText("*"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("<"),
                                    action = KeyAction.CommitText("<"),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("8"),
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("\""),
                                    action = KeyAction.CommitText("\""),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("'"),
                                    action = KeyAction.CommitText("'"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(":"),
                                    action = KeyAction.CommitText(":"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("."),
                                    action = KeyAction.CommitText("."),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(","),
                                    action = KeyAction.CommitText(","),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("9"),
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    swipes =
                        mapOf(
                            SwipeDirection.TOP to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("&"),
                                    action = KeyAction.CommitText("&"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.TOP_RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("°"),
                                    action = KeyAction.CommitText("°"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.RIGHT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(">"),
                                    action = KeyAction.CommitText(">"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM_LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay(";"),
                                    action = KeyAction.CommitText(";"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.LEFT to
                                KeyC(
                                    display = KeyDisplay.TextDisplay("#"),
                                    action = KeyAction.CommitText("#"),
                                    color = ColorVariant.MUTED,
                                ),
                            SwipeDirection.BOTTOM to
                                KeyC(
                                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardArrowDown),
                                    action =
                                        KeyAction.SendEvent(
                                            KeyEvent(
                                                KeyEvent.ACTION_DOWN,
                                                KeyEvent.KEYCODE_DPAD_DOWN,
                                            ),
                                        ),
                                    color = ColorVariant.MUTED,
                                ),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KB_DE_MESSAGEEASE_SYMBOLS_BIG_DIRECTIONS,
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("0"),
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_DE_MESSAGEEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "deutsch extended messagEase",
        modes =
            KeyboardDefinitionModes(
                main = KB_DE_MESSAGEEASE_SYMBOLS_MAIN,
                shifted = KB_DE_MESSAGEEASE_SYMBOLS_SHIFTED,
                numeric = KB_DE_MESSAGEEASE_SYMBOLS_NUMERIC_KEYBOARD,
            ),
    )
