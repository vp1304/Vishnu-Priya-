package com.example.grama_angana.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.grama_angana.ui.screens.applications.ApplicationsScreen
import com.example.grama_angana.ui.screens.dashboard.DashboardScreen
import com.example.grama_angana.ui.screens.profile.ProfileScreen
import com.example.grama_angana.ui.screens.settings.SettingsScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {
        composable(route = Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen()
        }
        composable(route = Screen.Settings.route) {
            SettingsScreen()
        }
        composable(route = Screen.Applications.route) {
            ApplicationsScreen(navController = navController)
        }
    }
}