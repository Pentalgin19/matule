package com.example.test2

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.ui.theme.editColor
import com.example.test2.ui.theme.editTextColor
import com.example.test2.ui.theme.stroke
import com.example.test2.ui.theme.textBtnColor
import com.example.test2.ui.theme.textColor

class Verification : ComponentActivity() {
    val funs = Functions()
    val font = FontFamily(Font(R.font.peninim))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                Verif()
            }
        }
    }

    fun aaaaaaaaaaa() {}

    @SuppressLint("RememberReturnType")
    @Composable
    fun Verif(

    ) {
        ConstraintLayout(modifier = Modifier.fillMaxSize()) {
            val link1 = createRef()
            val link3 = createRef()
            val link4 = createRef()
            val tick = remember { mutableStateOf(30) }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp, start = 20.dp, end = 20.dp)
                .constrainAs(link1) {
                    top.linkTo(parent.top)
                    absoluteLeft.linkTo(parent.absoluteLeft)
                    absoluteRight.linkTo(parent.absoluteRight)
                })
            {
                funs.TextFun("ОТР Проверка", 32, true, textColor)
                funs.TextFun(
                    "Пожалуйста, Проверьте Свою\nЭлектронную Почту, Чтобы Увидеть Код\nПодтверждения",
                    16,
                    true,
                    editTextColor
                )
                Text(
                    "ОТР Код",
                    fontFamily = font,
                    fontSize = 21.sp,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(top = 16.dp, bottom = 20.dp)
                )

                val code1 = remember { mutableStateOf("") }
                val code2 = remember { mutableStateOf("") }
                val code3 = remember { mutableStateOf("") }
                val code4 = remember { mutableStateOf("") }
                val code5 = remember { mutableStateOf("") }
                val code6 = remember { mutableStateOf("") }
                remember { timer(tick) }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                ) {
                    OutlinedTextField(
                        value = code1.value,
                        onValueChange = {
                            if (code1.value.count() > 1) {

                            }
                            code1.value = it
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = editColor,
                            unfocusedContainerColor = editColor,
                            focusedBorderColor = stroke,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true,
                        textStyle = androidx.compose.ui.text.TextStyle(
                            fontSize = 18.sp,
                            fontFamily = FontFamily(Font(R.font.raleway)),
                            color = textColor,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    OutlinedTextField(
                        value = code2.value,
                        onValueChange = {
                            code2.value = it
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = editColor,
                            unfocusedContainerColor = editColor,
                            focusedBorderColor = stroke,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    OutlinedTextField(
                        value = code3.value,
                        onValueChange = {
                            code3.value = it
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = editColor,
                            unfocusedContainerColor = editColor,
                            focusedBorderColor = stroke,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    OutlinedTextField(
                        value = code4.value,
                        onValueChange = {
                            code4.value = it
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = editColor,
                            unfocusedContainerColor = editColor,
                            focusedBorderColor = stroke,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    OutlinedTextField(
                        value = code5.value,
                        onValueChange = {
                            code5.value = it
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = editColor,
                            unfocusedContainerColor = editColor,
                            focusedBorderColor = stroke,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    OutlinedTextField(
                        value = code6.value,
                        onValueChange = {
                            code6.value = it
                        },
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = editColor,
                            unfocusedContainerColor = editColor,
                            focusedBorderColor = stroke,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        singleLine = true
                    )
                }
            }
            Text(
                "Отправить заново",
                fontFamily = font,
                fontSize = 12.sp,
                color = if (tick.value != 0) textBtnColor else Color.Black,
                modifier = if (tick.value != 0) {
                    Modifier.constrainAs(link3) {
                        top.linkTo(link1.bottom, margin = 20.dp)
                        absoluteLeft.linkTo(parent.absoluteLeft, margin = 20.dp)
                    }
                } else {
                    Modifier
                        .constrainAs(link3) {
                            top.linkTo(link1.bottom, margin = 20.dp)
                            absoluteLeft.linkTo(parent.absoluteLeft, margin = 20.dp)
                        }
                        .clickable { timer(tick) }
                }
            )
            Text(
                text = if (tick.value >= 10) {
                    "00:${tick.value}"
                } else {
                    "00:0${tick.value}"
                },
                modifier = Modifier.constrainAs(link4) {
                    top.linkTo(link1.bottom, margin = 20.dp)
                    absoluteRight.linkTo(parent.absoluteRight, margin = 20.dp)
                },

                fontFamily = font,
                fontSize = 12.sp,
                color = textBtnColor
            )


        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    private fun VerifPreview() {
        Verif()
    }

    fun timer(mutableState: MutableState<Int>) {
        val timer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                mutableState.value = (millisUntilFinished / 1000).toInt()
            }

            override fun onFinish() {
                mutableState.value = 0
            }

        }.start()
    }
}

