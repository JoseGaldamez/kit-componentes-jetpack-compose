package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
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
fun CheckBoxScreen(navController: NavHostController) {
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
                    Text(text = "CheckBox Screen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            var checkedValue by remember {
                mutableStateOf(false)
            }

            Checkbox(
                checked = checkedValue,
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Yellow,
                    uncheckedColor = Color.Green,
                    checkmarkColor = Color.Blue,
                ),
                //para cambiar el tamaño de un checkbox se necesita
                // el modifier y la propiedad scale
                modifier = Modifier,

                onCheckedChange = {
                checkedValue = it
            })

            HorizontalDivider()


            var checkedValue2 by remember {
                mutableStateOf(false)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue2 = !checkedValue2
                }
            ) {

            Checkbox(
                checked = checkedValue2,
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Yellow,
                    uncheckedColor = Color.Green,
                    checkmarkColor = Color.Blue,
                ),
                //para cambiar el tamaño de un checkbox se necesita
                // el modifier y la propiedad scale
                modifier = Modifier,

                onCheckedChange = {
                    //checkedValue2 = it
                })

                Text(text = "Checkbox 2")


            }




        }
    }
}