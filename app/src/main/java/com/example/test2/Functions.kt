package com.example.test2

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test2.ui.theme.btnColor
import com.example.test2.ui.theme.editColor
import com.example.test2.ui.theme.editTextColor

class Functions() {
    var isShow: Boolean = true
    var passw: String = ""
    val font = FontFamily(Font(R.font.peninim))

    fun showPassword(value: String): String {
        var ans = ""
        if (isShow) {
            for (i in 0..value.count() - 1) {
                ans = ans + "*"
            }
            isShow = false
        } else {
            ans = passw
            isShow = true
        }
        return ans
    }

    @Composable
    fun TextFun(value: String, textSize: Int, isCenter: Boolean = false, tempTextColor: Color) {
        Text(
            value,
            modifier = Modifier
                .padding(bottom = 12.dp)
                .fillMaxWidth(),
            fontFamily = font,
            fontSize = textSize.sp,
            color = tempTextColor,
            textAlign = if (isCenter) {
                TextAlign.Center
            } else {
                TextAlign.Left
            }
        )
    }

    @Composable
    fun EditTextFun(
        value: MutableState<String>,
        placehold: String,
        paddingBottom: Int = 0,
        showEye: Boolean = false
    ) {
        TextField(
            value = value.value,
            onValueChange = {
                value.value = it
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = editColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            textStyle = TextStyle(
                fontSize = 14.sp, fontFamily = font, color = editTextColor
            ),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = paddingBottom.dp),
            placeholder = {
                Text(placehold, fontSize = 14.sp, fontFamily = font, color = editTextColor)
            },
            trailingIcon = {
                if (showEye) {
                    if (isShow) {
                        passw = value.value
                    }
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.eye),
                        contentDescription = "eye",
                        modifier = Modifier.clickable {
                            value.value = showPassword(value.value)
                        }
                    )
                }
            }
        )
    }

    @Composable
    fun Btn(text: String) {
        Button(
            onClick = {}, shape = RoundedCornerShape(14.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = btnColor),
        ) {
            Text(
                text,
                fontSize = 14.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.raleway)),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}