package com.example.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.ui.theme.editTextColor
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
    @Composable
    fun Verif() {
        ConstraintLayout() {
            val link1 = createRef()
            val link2 = createRef()
            Column(modifier = Modifier.fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 100.dp)
                .constrainAs(link1) {
                    top.linkTo(parent.top)
                    absoluteLeft.linkTo(parent.absoluteLeft)
                    absoluteRight.linkTo(parent.absoluteRight)
                }) {
                funs.TextFun("ОТР Проверка", 32, true, textColor)
                funs.TextFun("Пожалуйста, Проверьте Свою\nЭлектронную Почту, Чтобы Увидеть Код\nПодтверждения", 16, true, editTextColor)
                Text("ОТР Код", fontFamily = font, fontSize = 21.sp, modifier = Modifier.align(Alignment.Start).padding(top = 16.dp))
                val code1 = remember { mutableStateOf(0) }
                val code2 = remember { mutableStateOf(Int) }
                val code3 = remember { mutableStateOf(Int) }
                val code4 = remember { mutableStateOf(Int) }
                val code5 = remember { mutableStateOf(Int) }
                val code6 = remember { mutableStateOf(Int) }
                Row() {
                    TextField(
                        value = code1.value,
                        onValueChange = {
                            code1.value = it
                        }
                    )
                    TextField()
                    TextField()
                    TextField()
                    TextField()
                    TextField()
                }
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    private fun VerifPreview() {
        Verif()
    }
}
