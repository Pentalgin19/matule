package com.example.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.ui.theme.editTextColor
import com.example.test2.ui.theme.textColor

class ForgotPassword : ComponentActivity() {
    val font = FontFamily(Font(R.font.peninim))
    val funs = Functions()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                FP()
            }
        }
    }

    @Composable
    fun Alert() {
        val openDialog = remember { mutableStateOf(false) }
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
            title = {
                Text(
                    text = "Проверьте ваш Email",
                    modifier = Modifier
                        .padding(top = 130.dp, bottom = 13.dp),
                    textColor,
                    16.sp,
                    fontFamily = font
                )
            },
            text = {
                Text(
                    "Мы отправили код восстановления\nпароля на вашу электронную почту.",
                    modifier = Modifier
                        .padding(top = 130.dp, bottom = 13.dp),
                    editTextColor,
                    16.sp,
                    fontFamily = font
                )
            },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.email_icon),
                    contentDescription = "email"
                )
            },
            confirmButton = {
                Button({ openDialog.value = false }) {
                    Text("OK", fontSize = 22.sp)
                }
            }
        )
    }
    fun OpenDialog() {
    }

    @Composable
    fun FP() {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(
                "Забыл Пароль",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 130.dp, bottom = 13.dp),
                textColor,
                32.sp,
                fontFamily = font
            )
            Text(
                "Введите Свою Учетную Запись\n" +
                        "Для Сброса",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 40.dp),
                editTextColor,
                16.sp,
                fontFamily = font,
                textAlign = TextAlign.Center
            )
            val openDialog = remember { mutableStateOf(false) }
            val email = remember { mutableStateOf("") }
            funs.EditTextFun(email, "xyz@gmail.com", 16)
            funs.Btn("Отправить", {
                openDialog.value = true
            })

            if (openDialog.value) {
                Dialog(
                    onDismissRequest = { openDialog.value = false }
                ) {
                    Card(modifier = Modifier.fillMaxWidth(),
                        ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.email_icon),
                            contentDescription = "email",
                            tint = Color.Unspecified,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(top = 20.dp, bottom = 24.dp)
                        )

                        Text(
                            text = "Проверьте ваш Email",
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(bottom = 8.dp),
                            textColor,
                            16.sp,
                            fontFamily = font
                        )

                        Text(
                            "Мы отправили код восстановления\nпароля на вашу электронную почту.",
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(bottom = 20.dp),
                            editTextColor,
                            16.sp,
                            fontFamily = font,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    private fun FPP() {
        FP()
    }
}