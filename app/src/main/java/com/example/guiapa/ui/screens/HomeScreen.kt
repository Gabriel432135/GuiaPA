package com.example.guiapa.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Guia PA")
                }
            )
        }
    )
    {
        innerPadding ->
        Column{
            Text(text = "Guia PA")
            BusinessCategoryList()
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}