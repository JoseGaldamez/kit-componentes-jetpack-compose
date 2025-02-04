package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun IndicatorsScreen(navController: NavHostController) {
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
                    Text(text = "Indicators Screen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            Text(text = "Circular indicator", modifier = Modifier.padding(16.dp))
            HorizontalDivider()

            CircularProgressIndicator(
                color = Color.Red,
                trackColor = Color.LightGray,
                strokeWidth = 7.dp,
                modifier = Modifier.padding(16.dp),
            )

            Text(text = "Progress Bar indicator", modifier = Modifier.padding(16.dp))
            HorizontalDivider()

            var progressValue by remember {
                mutableStateOf(0.0f)
            }

            LinearProgressIndicator(
                color = Color.Red,
                trackColor = Color.LightGray,
                modifier = Modifier.fillMaxWidth(),
                progress = { progressValue }
            )

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {


                ElevatedButton(onClick = {
                    progressValue -= 0.1f
                }) {
                    Text(text = "Disminuir -")
                }

            ElevatedButton(onClick = {
                progressValue += 0.1f
            }) {
                Text(text = "Aumentar +")
            }

            }



        }
    }
}