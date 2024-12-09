package com.example.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.ui.theme.blue1
import com.example.test2.ui.theme.blue2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
               Matule()
            }
        }
    }
}

@Composable
fun Matule() {
    val font = FontFamily(Font(R.font.raleway_bold))
    val font1 = FontFamily(Font(R.font.raleway))
    val brush = Brush.verticalGradient(colors = listOf(blue1, blue2))
    Row(modifier = Modifier.fillMaxSize().background(brush).clickable {  }, verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "MATULE",
                fontFamily = font,
                fontSize = 42.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Top))

            Text(
                text = "ME",
                fontFamily = font1,
                fontSize = 25.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.align(Alignment.Top).offset(x = 5.dp))
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MatulePreview() {
   Matule()
}