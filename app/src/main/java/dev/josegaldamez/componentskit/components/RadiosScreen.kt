package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
fun RadioScreen(navController: NavHostController) {
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
                    Text(text = "Radio Screen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {


            //Ejemplo básico

            var selectedOption by remember { mutableStateOf(false) }

            RadioButton(selected = selectedOption,
                onClick = { selectedOption = !selectedOption })

            HorizontalDivider()

            var selectedOption2 by remember { mutableStateOf(false) }

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {

                RadioButton(selected = selectedOption2,
                    onClick = { selectedOption2 = !selectedOption2 })

                Text(text = "Option of radio",
                    modifier = Modifier.clickable { selectedOption2 = !selectedOption2 } )

            }

            HorizontalDivider()


            var optionSelected by remember { mutableStateOf(1) }


            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {

                RadioButton(
                    selected = ( optionSelected == 1 ),
                    onClick = {
                        optionSelected = 1
                    })

                Text(text = "Option of radio 1")

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {

                RadioButton(selected = ( optionSelected == 2 ),
                    onClick = { optionSelected = 2 })

                Text(text = "Option of radio 2",
                    modifier = Modifier )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {

                RadioButton(selected = ( optionSelected == 3 ),
                    onClick = { optionSelected = 3 })

                Text(text = "Option of radio 3",
                    modifier = Modifier )

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {

                RadioButton(selected = ( optionSelected == 4 ),
                    onClick = { optionSelected = 4 })

                Text(text = "Option of radio 4",
                    modifier = Modifier )

            }
            
            Text(
                text = optionSelected.toString(), fontSize = 50.sp, modifier = Modifier.padding(24.dp))


            HorizontalDivider()

            RadioButton(
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Red,
                    unselectedColor = Color.Blue,
                    disabledSelectedColor = Color.Green,
                    disabledUnselectedColor = Color.Yellow
                ),
                enabled = false,
                selected = false,
                onClick = { /*TODO*/ })


        }
    }
}