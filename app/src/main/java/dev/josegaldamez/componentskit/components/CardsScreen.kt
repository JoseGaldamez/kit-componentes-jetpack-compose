package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardsScreen(navController: NavHostController) {
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
                    Text(text = "Cards Screen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {


                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(model = "https://lumiere-a.akamaihd.net/v1/images/homepage_hero_mobile_insideout_streetmessageupdate_span_0aea4bd0.jpeg", contentDescription = "Intensamente 2")
                    Text(text = "Intensamente 2",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(model = "https://stylelovely.com/wp-content/uploads/2020/04/proyecto-rampagne-peliculas-mas-vistas-durante-la-cuarentena.jpg", contentDescription = "Rampage")
                    Text(text = "Rampage",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(model = "https://www.lavanguardia.com/peliculas-series/images/movie/poster/2020/1/w1280/zXYARspjKpwN9vAOp2F9MF3NWa1.jpg", contentDescription = "BadBoy4")
                    Text(text = "Bad Boys 4",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }


                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(model = "https://lumiere-a.akamaihd.net/v1/images/homepage_hero_mobile_insideout_streetmessageupdate_span_0aea4bd0.jpeg", contentDescription = "Intensamente 2")
                    Text(text = "Intensamente 2",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(model = "https://stylelovely.com/wp-content/uploads/2020/04/proyecto-rampagne-peliculas-mas-vistas-durante-la-cuarentena.jpg", contentDescription = "Rampage")
                    Text(text = "Rampage",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    AsyncImage(model = "https://www.lavanguardia.com/peliculas-series/images/movie/poster/2020/1/w1280/zXYARspjKpwN9vAOp2F9MF3NWa1.jpg", contentDescription = "BadBoy4")
                    Text(text = "Bad Boys 4",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }


            }





        }
    }
}