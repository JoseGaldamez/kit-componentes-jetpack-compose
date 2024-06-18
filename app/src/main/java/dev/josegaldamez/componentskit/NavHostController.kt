package dev.josegaldamez.componentskit

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.josegaldamez.componentskit.components.BadgeScreen
import dev.josegaldamez.componentskit.components.BottomAppBarScreen
import dev.josegaldamez.componentskit.components.ButtonsScreen
import dev.josegaldamez.componentskit.components.CardsScreen
import dev.josegaldamez.componentskit.components.CheckBoxScreen
import dev.josegaldamez.componentskit.components.DrawerScreen
import dev.josegaldamez.componentskit.components.DropdownScreen
import dev.josegaldamez.componentskit.components.IconsScreen
import dev.josegaldamez.componentskit.components.ImageScreen
import dev.josegaldamez.componentskit.components.IndicatorsScreen
import dev.josegaldamez.componentskit.components.PagerScreen
import dev.josegaldamez.componentskit.components.RadioScreen
import dev.josegaldamez.componentskit.components.SliderScreen
import dev.josegaldamez.componentskit.components.SwitchScreen
import dev.josegaldamez.componentskit.components.TextFieldScreen
import dev.josegaldamez.componentskit.components.TextScreen

@Composable
fun NavHostController() {

    val navController = rememberNavController()

    NavHost( navController= navController, startDestination = "home" ){

        composable(route = "home"){ HomeScreen(navController) }
        composable(route = "text"){ TextScreen(navController) }
        composable(route = "icon"){ IconsScreen(navController) }
        composable(route = "button"){ ButtonsScreen(navController) }
        composable(route = "textfield"){ TextFieldScreen(navController) }
        composable(route = "checkbox"){ CheckBoxScreen(navController) }
        composable(route = "switch"){ SwitchScreen(navController) }
        composable(route = "radio"){ RadioScreen(navController) }
        composable(route = "image"){ ImageScreen(navController) }
        composable(route = "indicators"){ IndicatorsScreen(navController) }
        composable(route = "badge"){ BadgeScreen(navController) }
        composable(route = "slider"){ SliderScreen(navController) }
        composable(route = "dropdown"){ DropdownScreen(navController) }
        composable(route = "cards"){ CardsScreen(navController) }
        composable(route = "pager"){ PagerScreen(navController) }
        composable(route = "bottomNavigation"){ BottomAppBarScreen(navController) }
        composable(route = "drawer"){ DrawerScreen(navController) }

    }



}