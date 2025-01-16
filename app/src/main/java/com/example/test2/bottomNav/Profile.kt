package com.example.test2.bottomNav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.test2.ui.theme.Test2Theme

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                ProfileFun()
            }
        }
    }
}

@Composable
fun ProfileFun() {
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
fun ProfilePreview() {
    Test2Theme {
        ProfileFun()
    }
}