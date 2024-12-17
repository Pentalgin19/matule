package com.example.test2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.ui.theme.textColor

class Onboard1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                Onb1()
            }
        }
    }

    @Composable
    fun Onb1() {

        val intent1 = Intent(this@Onboard1, Onboard2::class.java)
        Image(
            painter = painterResource(R.drawable.onboard1),
            contentDescription = "onboard1",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        ConstraintLayout(modifier = Modifier.fillMaxSize()) {
            val linkText = createRef()
            val linkBtn = createRef()
            Text(
                "ДОБРО\nПОЖАЛОВАТЬ",
                modifier = Modifier.constrainAs(linkText) {
                    top.linkTo(parent.top, margin = 80.dp)
                    absoluteLeft.linkTo(parent.absoluteLeft)
                    absoluteRight.linkTo(parent.absoluteRight)
                },
                fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.raleway_bold)),
                fontWeight = FontWeight.Black,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Button(
                onClick = {startActivity(intent1)},
                shape = RoundedCornerShape(13.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier.constrainAs(linkBtn) {
                    bottom.linkTo(parent.bottom, margin = 40.dp)
                    absoluteLeft.linkTo(parent.absoluteLeft)
                    absoluteRight.linkTo(parent.absoluteRight)

                }.fillMaxWidth().padding(horizontal = 20.dp)
            ) {
                Text(
                    "Начать",
                    fontSize = 14.sp,
                    color = textColor,
                    fontFamily = FontFamily(Font(R.font.raleway)),
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }

    @Preview(showSystemUi = true, showBackground = true)
    @Composable
    fun Onb1Preview() {
        Onb1()
    }
}