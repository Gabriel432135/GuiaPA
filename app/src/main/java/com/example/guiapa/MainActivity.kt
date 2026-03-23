package com.example.guiapa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.guiapa.ui.BusinessViewModel
import com.example.guiapa.ui.GuiaPANavHost
import com.example.guiapa.ui.screens.HomeScreen
import com.example.guiapa.ui.theme.GuiaPATheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val windowSize: WindowSizeClass = calculateWindowSizeClass(this)
            GuiaPATheme(windowSize = windowSize) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GuiaPANavHost(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}