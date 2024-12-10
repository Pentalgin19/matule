package com.example.test2

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
import androidx.compose.material3.Scaffold
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

class Onboard3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
            }
        }
    }
}

@Composable
fun Onb3() {
    Image(
        painter = painterResource(R.drawable.onboard3),
        contentDescription = "onboard3",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val linkText = createRef()
        val linkText2 = createRef()
        val linkBtn = createRef()
        Text(
            "У Вас Есть Сила,\nчтобы",
            modifier = Modifier.constrainAs(linkText) {
                bottom.linkTo(linkText2.top, margin = 15.dp)
                absoluteLeft.linkTo(parent.absoluteLeft)
                absoluteRight.linkTo(parent.absoluteRight)
            },
            fontSize = 34.sp,
            fontFamily = FontFamily(Font(R.font.raleway_bold)),
            fontWeight = FontWeight.Thin,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Text(
            "В вашей комнате много красивых и\nпривлекательных растений",
            modifier = Modifier.constrainAs(linkText2) {
                bottom.linkTo(linkBtn.top, margin = 135.dp)
                absoluteLeft.linkTo(parent.absoluteLeft)
                absoluteRight.linkTo(parent.absoluteRight)
            },
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.raleway)),
            fontWeight = FontWeight.Normal,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Button(
            onClick = {},
            shape = RoundedCornerShape(13.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            modifier = Modifier.constrainAs(linkBtn) {
                bottom.linkTo(parent.bottom, margin = 40.dp)
                absoluteLeft.linkTo(parent.absoluteLeft)
                absoluteRight.linkTo(parent.absoluteRight)

            }.fillMaxWidth().padding(horizontal = 20.dp)
        ) {
            Text(
                "Далее",
                fontSize = 14.sp,
                color = textColor,
                fontFamily = FontFamily(Font(R.font.raleway)),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Onb3Preview() {
    Onb3()
}