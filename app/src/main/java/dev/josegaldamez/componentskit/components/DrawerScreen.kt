package dev.josegaldamez.componentskit.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerScreen(navController: NavHostController) {


    var drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){

                    AsyncImage(
                        modifier = Modifier.padding(bottom = 20.dp).clip( CircleShape ).size(100.dp),
                        model = "https://i.pinimg.com/564x/c6/89/95/c68995aa24906a1320b4d7d10aa374b2.jpg" ,
                        contentDescription = "Jose")

                    Text(text = "Hola José", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                    Text(text = "Opción 1")
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text(text = "Opción 2")
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text(text = "Opción 3")
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text(text = "Opción 4")
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

                    TextButton(onClick = { navController.popBackStack() }) {
                        Text(text = "Volver")
                    }

                }
            }
        }) {

        Scaffold(
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        IconButton(onClick = {

                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }


                        }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Go back"
                            )
                        }
                    },
                    title = {
                        Text(text = "Drawer Screen")
                    })
            },


            ) {
            Column(modifier = Modifier.padding(it)) {

            }
        }


    }



}