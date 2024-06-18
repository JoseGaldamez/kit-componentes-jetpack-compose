package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
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
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownScreen(navController: NavHostController) {
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
                    Text(text = "Dropdown Screen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            var valueText by remember { mutableStateOf("") }
            var expandedDropdown by remember { mutableStateOf(false) }

            Box(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp) ){
                TextField(
                    label = { Text(text = "Selecciona una serie") },
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = valueText,
                    onValueChange = {},
                    trailingIcon = {
                        IconButton(onClick = { expandedDropdown = true }) {
                            Icon(imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Expandir opciones")
                        }
                    }
                )

                DropdownMenu(
                    modifier = Modifier.fillMaxWidth( fraction = 0.91f ),
                    expanded = expandedDropdown, onDismissRequest = { /*TODO*/ }) {

                    DropdownMenuItem(text = { Text(text = "The Walking Dead") }, onClick = {
                        valueText = "The Walking Dead"
                        expandedDropdown = false
                    })
                    DropdownMenuItem(text = { Text(text = "Game of Thrones") }, onClick = {
                        valueText = "Game of Thrones"
                        expandedDropdown = false
                    })
                    DropdownMenuItem(text = { Text(text = "The Boys") }, onClick = {
                        valueText = "The Boys"
                        expandedDropdown = false
                    })

                }
            }



        }
    }
}