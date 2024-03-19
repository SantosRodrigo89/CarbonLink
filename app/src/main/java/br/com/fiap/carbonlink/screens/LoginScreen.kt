package br.com.fiap.carbonlink.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.carbonlink.R

@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFEDF1D6))
        .padding(32.dp)
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logocompleta),
                contentDescription = "logo",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(id = R.drawable.mundo),
                contentDescription = "logo",
                modifier = Modifier.size(280.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = { navController.navigate("carteira") },
                colors = ButtonDefaults.buttonColors(Color(0xFF40513B)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text(text = "Login", fontSize = 20.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row( verticalAlignment = Alignment.CenterVertically ) {
                Text(text = "Não possui conta ?")
                Button(
                    onClick = { navController.navigate("cadastrar") },
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Text(text = "Clique aqui", fontSize = 16.sp, color = Color(0xFF40513B))
                }
            }
        }
    }
}


