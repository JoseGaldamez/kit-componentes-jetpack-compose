package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.ImageLoader
import coil.compose.AsyncImage
import dev.josegaldamez.componentskit.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageScreen(navController: NavHostController) {
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
                    Text(text = "Image Screen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Android")

            Box(modifier = Modifier.background(color = Color.Green)){
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground ), contentDescription = "Android")
            }

            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(300.dp),
                painter = painterResource(id = R.drawable.android),
                contentDescription = "Android")

            HorizontalDivider()

            Text(text = "Imagenes desde internet", fontSize = 20.sp)

            AsyncImage(
                model = "https://i.blogs.es/0a5896/android-15/1366_2000.jpeg" ,
                contentDescription = "Android papá con su hijo de la mano" )

        }

    }
}