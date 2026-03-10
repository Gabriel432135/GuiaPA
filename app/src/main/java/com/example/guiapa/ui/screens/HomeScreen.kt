package com.example.guiapa.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(){
    Scaffold(
        
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