package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.CloseFullscreen
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.sharp.Call
import androidx.compose.material.icons.sharp.Face
import androidx.compose.material.icons.twotone.Image
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go back"
                        )
                    }
                },
                title = {
                    Text(text = "Buttons Screen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            Box(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(16.dp)
                .fillMaxWidth()
            ){
                Text(text = "IconButton")
            }


            Row {

                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = { println("soy un icon button") }) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "Icon",
                        modifier = Modifier.size(90.dp)
                    )
                }

                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = { println("soy un icon button") }) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Icon",
                        tint = Color.Green,
                        modifier = Modifier.size(90.dp)
                    )
                }

                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = { println("Cerrando aplicacion") }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Icon",
                        tint = Color.Red,
                        modifier = Modifier.size(90.dp)
                    )
                }
            }

            Box(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(16.dp)
                .fillMaxWidth()
            ){
                Text(text = "ElevatedButton")
            }

            ElevatedButton(
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 5.dp
                ),
                modifier = Modifier
                    .padding(50.dp, 10.dp)
                    .width(300.dp),
                onClick = { println("soy un elevated button") }) {
                Text(text = "Elevated Button")
            }

            ElevatedButton(
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 5.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .padding(50.dp, 10.dp)
                    .width(300.dp),
                onClick = { println("soy un elevated button") }) {
                Text(text = "Elevated Button")
            }


            Box(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(16.dp)
                .fillMaxWidth()
            ){
                Text(text = "OutlinedButton")
            }
            
            OutlinedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Magenta
                ),
                border = BorderStroke(width = 5.dp, color = Color.Magenta),
                onClick = { println("soy un outlined button") }) {
                Text(text = "Soy un outlined button")
            }

            Box(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(16.dp)
                .fillMaxWidth()
            ){
                Text(text = "FilledTonalButton")
            }
            
            FilledTonalButton(onClick = { println("Soy un filledTonalButton") }) {
                Text(text = "Soy un filled tonal button")
            }

            Box(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(16.dp)
                .fillMaxWidth()
            ){
                Text(text = "filled icon button")
            }

            FilledIconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.CloseFullscreen, contentDescription = "Close")
            }

            Box(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(16.dp)
                .fillMaxWidth()
            ){
                Text(text = "ElevatedButton disabled (se puede aplicar a todos los botones) ")
            }

            ElevatedButton(
                enabled = false,
                onClick = {  }) {
                Text(text = "Soy un botón")
            }



            

        }


    }


}