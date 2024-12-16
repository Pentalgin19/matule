package com.example.test2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
import com.example.test2.ui.theme.textColor

class Register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                Reg()
            }
        }
    }

    @Composable
    fun Reg() {
        val funs = Functions()
        val font = FontFamily(Font(R.font.peninim))
        ConstraintLayout() {
            val link1 = createRef()
            val link2 = createRef()
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .constrainAs(link1) {
                    top.linkTo(parent.top)
                    absoluteLeft.linkTo(parent.absoluteLeft)
                    absoluteRight.linkTo(parent.absoluteRight)
                })
            {
                Text(
                    "Регистрация",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 101.dp, bottom = 13.dp),
                    textColor,
                    32.sp,
                    fontFamily = font
                )
                Text(
                    "Заполните Свои данные или\nпродолжите через социальные медиа",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 40.dp),
                    editTextColor,
                    16.sp,
                    fontFamily = font,
                    textAlign = TextAlign.Center
                )
                val email = remember { mutableStateOf("") }
                funs.TextFun("Ваше имя", 16, false, textColor)
                funs.EditTextFun(email, "хххххххх", 16)
                funs.TextFun("Email", 16, false, textColor)
                funs.EditTextFun(email, "xyz@gmail.com", 16)
                funs.TextFun("Пароль", 16, false, textColor)
                funs.EditTextFun(email, "••••••••", 16, true)
                val check = remember { mutableStateOf(false) }
                Checkbox(
                    checked = check.value,
                    onCheckedChange = { check.value = it }
                    //interactionSource =
                )
                funs.Btn("Зарегистрироваться")
            }
            Row(
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .constrainAs(link2) {
                        bottom.linkTo(parent.bottom, margin = 30.dp)
                        absoluteLeft.linkTo(parent.absoluteLeft)
                        absoluteRight.linkTo(parent.absoluteRight)
                    }
            ) {
                Text(
                    "Есть аккаунт? ",
                    modifier = Modifier,
                    editTextColor,
                    fontSize = 16.sp,
                    fontFamily = font
                )
                Text(
                    "Войти",
                    modifier = Modifier.clickable {
                        startActivity(
                            Intent(this@Register, SignIn::class.java)
                        )
                    },
                    textColor,
                    fontSize = 16.sp,
                    fontFamily = font
                )
            }
        }
    }

    @Preview(
        showBackground = true, showSystemUi = true
    )
    @Composable
    private fun RegPreview() {
        Reg()
    }
}
