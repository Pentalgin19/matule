package com.example.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.ui.theme.editTextColor

class SignIn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                Email()
            }
        }
    }
}

@Composable
fun Email() {
    TextField(value = "xyz@gmail.com", onValueChange = {},
        colors = TextFieldDefaults.colors(focusedContainerColor = editTextColor)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun EmailP() {
    Email()
}