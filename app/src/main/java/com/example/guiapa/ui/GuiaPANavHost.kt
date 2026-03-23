package com.example.guiapa.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guiapa.model.Category
import com.example.guiapa.ui.screens.BusinessDetailScreen
import com.example.guiapa.ui.screens.BusinessList
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
    navController: NavHostController = rememberNavController(),
    viewModel: BusinessViewModel = viewModel(),
    modifier: Modifier = Modifier
){
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current


    NavHost(
        navController = navController,
        startDestination = HomeRoute,
        modifier = modifier
    ){
        composable<HomeRoute> {
            HomeScreen(
                onCategoryClick = { category ->
                    viewModel.updateCurrentCategory(category)
                    navController.navigate(BusinessListRoute)
                }
            )
        }


        composable<BusinessListRoute> {
            BusinessList(
                businesses = viewModel.filteredBusinesses,
                onBusinessClick = { business ->
                    viewModel.updateSelectedBusiness(business)
                    navController.navigate(BusinessDetailRoute)
                },
                onBackClick = { navController.popBackStack() }
            )
        }

        composable<BusinessDetailRoute> {
            uiState.selectedBusiness?.let { business ->
                BusinessDetailScreen(
                    business = business,
                    onBackClick = { navController.popBackStack() },
                    onCallClick = {
                        val intent = Intent(Intent.ACTION_DIAL).apply {
                            data = Uri.parse("tel:${business.phone}")
                        }
                        context.startActivity(intent)
                    },
                    onWebClick = {
                          val intent = Intent(Intent.ACTION_VIEW).apply {
                              data = Uri.parse(business.website)
                          }
                        context.startActivity(intent)
                    },
                    onLocationClick = {
                        val intent = Intent(Intent.ACTION_VIEW).apply{
                            data = Uri.parse("geo:0,0?q=${Uri.encode(business.address)}")
                        }
                        context.startActivity(intent)
                    }

                )
            }
        }
    }
}