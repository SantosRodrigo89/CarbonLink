package br.com.fiap.carbonlink

import MenuScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.carbonlink.screens.LoginScreen
import br.com.fiap.carbonlink.screens.ProfileScreen
import br.com.fiap.carbonlink.screens.WalletScreen
import br.com.fiap.carbonlink.ui.theme.CarbonLinkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarbonLinkTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                  val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ){
                        composable(route = "login"){ LoginScreen(navController)}
                        composable(route = "carteira"){ WalletScreen(navController) }
                        composable(route = "perfil"){ ProfileScreen(navController) }
                        composable(route = "menu"){ MenuScreen(navController) }
                    }
                }
            }
        }
    }
}
