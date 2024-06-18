package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBarScreen(navController: NavHostController) {

    var pageSelected by remember {
        mutableIntStateOf(0)
    }

    val pages = listOf( "Home", "Search", "Profile" )
    val colorPages = listOf( Color.Blue, Color.Red, Color.Green )

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
                    Text(text = "BottomNavigationBar Screen")
                })
        },
        bottomBar = {

            BottomAppBar {

                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    IconButton(onClick = {
                        pageSelected = 0
                    }) {

                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home",
                            tint = if(pageSelected == 0) Color.Magenta else Color.LightGray
                        )

                    }
                    IconButton(onClick = {
                        pageSelected = 1
                    }) {

                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "search",
                            tint = if(pageSelected == 1) Color.Magenta else Color.LightGray
                        )

                    }
                    IconButton(onClick = {
                        pageSelected = 2
                    }) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "perfil",
                            tint = if(pageSelected == 2) Color.Magenta else Color.LightGray
                        )
                    }


                }


            }

        }


    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(colorPages[pageSelected]) ) {

            Text(text = pages[pageSelected] , fontSize = 25.sp)

        }
    }
}