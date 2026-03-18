package com.example.guiapa.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.guiapa.ui.screens.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
object HomeRoute

@Serializable
object BusinessListRoute

@Serializable
object BusinessDetailRoute

@Composable
fun GuiaPANavHost(
    navController: NavHostController,
    viewModel: BusinessViewModel,
    modifier: Modifier = Modifier
){
    val uiState by viewModel.uiState.collectAsState()

    NavHost(
        navController = navController,
        startDestination = HomeRoute,
        modifier = modifier
    ){
        composable<HomeRoute>{
            HomeScreen(
                onCategoryClick = { category ->
                    viewModel.updateCurrentCategory(category)
                }
            )
        }
    }
}