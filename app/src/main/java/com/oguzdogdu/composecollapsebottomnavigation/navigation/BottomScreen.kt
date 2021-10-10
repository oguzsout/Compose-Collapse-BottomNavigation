package com.oguzdogdu.composecollapsebottomnavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomScreen(val route: String, val title: String, val icon: ImageVector) {
    object Home : BottomScreen("home", "Home", Icons.Filled.Home)
    object Favourites : BottomScreen("favourites", "Favourites", Icons.Filled.Favorite)
    object Search : BottomScreen("search", "Search", Icons.Filled.Search)
    object Settings : BottomScreen("settings", "Settings", Icons.Filled.Settings)
    object User : BottomScreen("users", "Users", Icons.Filled.Person)
}

val bottomNavigationItems = listOf(
    BottomScreen.Home,
    BottomScreen.Favourites,
    BottomScreen.Search,
    BottomScreen.Settings,
    BottomScreen.User
)