package br.com.fiap.carbonlink.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.carbonlink.R

@SuppressLint("InvalidColorHexValue")
@Composable
fun WalletScreen(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(16.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = "Carteira",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.verde_app)
                )
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { navController.navigate("login") },
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logout),
                        contentDescription = "logo",
                        modifier = Modifier.size(32.dp),
                        contentScale = ContentScale.Fit
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.verde_card)
                ),
                border = BorderStroke(1.dp, Color.Transparent),
                elevation = CardDefaults.cardElevation(4.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Saldo de Carbono",
                    modifier = Modifier
                        .padding(16.dp, 4.dp, 0.dp, 0.dp),
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 19.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Left,
                        color = Color(0xFF40513B)
                    ),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "200.000854716",
                    modifier = Modifier
                        .padding(16.dp, 2.dp, 0.dp, 2.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 35.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Left,
                        color = Color(0xFF40513B)
                    ),
                )
                Text(
                    text = "= R$ 2.000,00",
                    modifier = Modifier
                        .padding(16.dp, 0.dp, 0.dp, 16.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Light,
                        lineHeight = 18.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Left,
                        color = Color(0xFF40513B)
                    ),
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedCard(
                border = BorderStroke(1.dp, Color.Transparent),
                elevation = CardDefaults.cardElevation(2.dp),
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    text = "Chave de transferência",
                    modifier = Modifier
                        .padding(16.dp, 16.dp, 0.dp, 4.dp),
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        lineHeight = 19.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Left,
                        color = Color(0xFF40513B)
                    ),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "SDAGhsdhaiwbJHSDFhdsajLKFDAwNasdXb",
                    modifier = Modifier
                        .padding(16.dp, 2.dp, 0.dp, 16.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Light,
                        lineHeight = 35.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Left,
                        color = Color(0xFF40513B)
                    ),
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedCard(
                border = BorderStroke(1.dp, Color.Transparent),
                elevation = CardDefaults.cardElevation(2.dp),
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    text = "Histórico",
                    modifier = Modifier
                        .padding(16.dp, 16.dp, 0.dp, 4.dp),
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 19.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Left,
                        color = Color(0xFF40513B)
                    ),
                    textAlign = TextAlign.Center
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        text = "Kraft Heinz",
                        modifier = Modifier
                            .padding(16.dp, 16.dp, 0.dp, 4.dp),
                        style = TextStyle(
                            fontFamily = FontFamily.Monospace,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            lineHeight = 8.sp,
                            letterSpacing = 0.sp,
                            textAlign = TextAlign.Left,
                            color = Color(0xFF40513B)
                        ),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "+74.745247,84",
                        modifier = Modifier
                            .padding(16.dp, 16.dp, 0.dp, 4.dp),
                        style = TextStyle(
                            fontFamily = FontFamily.Monospace,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            lineHeight = 8.sp,
                            letterSpacing = 0.sp,
                            textAlign = TextAlign.Left,
                            color = Color(0xFF40513B)
                        ),
                        textAlign = TextAlign.Center
                    )
                }
                Text(
                    text = "22 Fev 2024, 14:52",
                    modifier = Modifier
                        .padding(16.dp, 16.dp, 0.dp, 4.dp),
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 8.sp,
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Left,
                        color = Color(0xFF40513B)
                    ),
                )
            }
        }
    }
}


