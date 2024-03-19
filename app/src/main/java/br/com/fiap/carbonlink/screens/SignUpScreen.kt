package br.com.fiap.carbonlink.screens

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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.fiap.carbonlink.R

@Composable
fun SignUpScreen(navController: NavHostController) {
    val nameFieldValue = remember { mutableStateOf("") }
    val emailFieldValue = remember { mutableStateOf("") }
    val cnpjFieldValue = remember { mutableStateOf("") }
    val passwordFieldValue = remember { mutableStateOf("") }
    val confirmPasswordFieldValue = remember { mutableStateOf("") }
    val showPassword = remember { mutableStateOf(false) }
    val showConfirmPassword = remember { mutableStateOf(false) }
    val selecionado  = remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = "Criar Conta",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.verde_app)
                )
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier.size(60.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = nameFieldValue.value,
                onValueChange = { newValue -> nameFieldValue.value = newValue },
                label = { Text("Nome Fantasia*") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.verde_claro_app))
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = emailFieldValue.value,
                onValueChange = { newValue -> emailFieldValue.value = newValue },
                label = { Text("E-mail*") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.verde_claro_app))
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = cnpjFieldValue.value,
                onValueChange = { newValue -> cnpjFieldValue.value = newValue },
                label = { Text("CNPJ*") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.verde_claro_app))
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = passwordFieldValue.value,
                onValueChange = { newValue -> passwordFieldValue.value = newValue },
                label = { Text("Senha*") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default,
                visualTransformation = if (showPassword.value) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    IconButton(
                        onClick = { showPassword.value = !showPassword.value },
                        modifier = Modifier
                            .size(24.dp)
                            .padding(end = 8.dp)
                    ) {
                        Icon(
                            imageVector = if (showPassword.value) Icons.Default.Clear else Icons.Default.Done,
                            contentDescription = if (showPassword.value) "Hide password" else "Show password"
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.verde_claro_app))
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = confirmPasswordFieldValue.value,
                onValueChange = { newValue -> confirmPasswordFieldValue.value = newValue },
                label = { Text("Confirmar Senha*") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default,
                visualTransformation = if (showConfirmPassword.value) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    IconButton(
                        onClick = { showConfirmPassword.value = !showConfirmPassword.value },
                        modifier = Modifier
                            .size(24.dp)
                            .padding(end = 8.dp)
                    ) {
                        Icon(
                            imageVector = if (showConfirmPassword.value) Icons.Default.Clear else Icons.Default.Done,
                            contentDescription = if (showConfirmPassword.value) "Hide password" else "Show password"
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.verde_claro_app))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = selecionado.value == 1,
                        onClick = { selecionado.value = 1 },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = colorResource(id = R.color.verde_card),
                            unselectedColor = colorResource(id = R.color.verde_claro_app),
                        )
                    )
                    Text(
                        text = "Eu aceito termos e condições",
                        color = colorResource(id = R.color.verde_app)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate("carteira") },
                colors = ButtonDefaults.buttonColors(Color(0xFF40513B)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text(text = "Registrar", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}



