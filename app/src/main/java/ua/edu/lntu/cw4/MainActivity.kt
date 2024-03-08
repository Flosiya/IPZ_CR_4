package ua.edu.lntu.cw4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ua.edu.lntu.cw4.ui.theme.IPZ_CR_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            IPZ_CR_4Theme {
                NavHost(
                    navController = navController,
                    startDestination = "screens_1"
                ) {
                    composable("screens_1") {
                        Screen1{
                            navController.navigate("screens_2")
                        }

                    }
                    composable("screens_2") {
                        Screen2{
                            navController.navigate("screens_3")
                        }

                    }
                    composable("screens_3") {
                        Screen3{
                            navController.navigate("screens_1")
                        }
                    }
                }
            }
        }
    }
}



