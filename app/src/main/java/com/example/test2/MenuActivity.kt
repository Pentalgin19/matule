package com.example.test2.bottomNav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.test2.ui.theme.Test2Theme

class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                MenuFun()
            }
        }
    }
}

@Composable //ImageVector.vectorResource(R.drawable.bottom_shape
fun MenuFun() {
    Row(modifier = Modifier.background()) {}
    val navCont = rememberNavController()
    NavHost(navController = navCont, startDestination = "home"){
        composable("home") { Home()  }
        composable("favorites") { Favorites()  }
        composable("notifications") { Notifications()  }
        composable("profile") { Profile()  }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    Test2Theme {
        MenuFun()
    }
}