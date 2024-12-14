package com.example.test2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.ui.theme.editTextColor
import com.example.test2.ui.theme.textBtnColor
import com.example.test2.ui.theme.textColor

class SignIn : ComponentActivity() {
    val funs = Functions()
    val font = FontFamily(Font(R.font.peninim))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                Sign()
            }
        }
    }

    @Composable
    fun Sign() {
        ConstraintLayout() {
            val link1 = createRef()
            val link2 = createRef()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp, vertical = 100.dp)
                    .constrainAs(link1) {
                        top.linkTo(parent.top)
                        absoluteLeft.linkTo(parent.absoluteLeft)
                        absoluteRight.linkTo(parent.absoluteRight)
                    }
            ) {
                val email = remember { mutableStateOf("") }
                val password = remember { mutableStateOf("") }
                funs.TextFun("Привет!", 32, true, textColor)
                funs.TextFun(
                    "Заполните Свои Данные Или\nПродолжите Через Социальные Медиа",
                    16,
                    true,
                    textBtnColor
                )
                funs.TextFun("Email", 16, false, textColor)
                funs.EditTextFun(email, "xyz@gmail.com", 26)
                funs.TextFun("Пароль", 16, false, textColor)
                funs.EditTextFun(password, "********", 0, true)
                Text(
                    "Восстановить",
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth()
                        .clickable { startActivity(Intent(this@SignIn, ForgotPassword::class.java)) },
                    fontFamily = font,
                    fontSize = 12.sp,
                    color = textBtnColor,
                    textAlign = TextAlign.End
                )
                funs.Btn("Войти")
            }
            Row(
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .constrainAs(link2) {
                        bottom.linkTo(parent.bottom, margin = 30.dp)
                        absoluteLeft.linkTo(parent.absoluteLeft)
                        absoluteRight.linkTo(parent.absoluteRight)
                    }
            ) {
                Text(
                    "Вы впервые? ",
                    modifier = Modifier,
                    editTextColor,
                    fontSize = 16.sp,
                    fontFamily = font
                )
                Text(
                    "Создать пользователя",
                    modifier = Modifier.clickable {
                        startActivity(
                            Intent(this@SignIn, Register::class.java)
                        )
                    },
                    textColor,
                    fontSize = 16.sp,
                    fontFamily = font
                )
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    private fun SignP() {
        Sign()
    }
}