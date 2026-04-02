package com.example.guiapa.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.guiapa.data.LocalBusinessProvider
import com.example.guiapa.model.Business
import com.example.guiapa.ui.theme.GuiaPATheme

@Composable
fun BusinessListDetail(
    modifier: Modifier = Modifier,
    businessList: List<Business> = emptyList(),
    selectedBusiness: Business? = null,
    onBusinessClick: (Business) -> Unit = {},
    onBackClick: () -> Unit = {},

    onCallClick: () -> Unit = {},
    onLocationClick: () -> Unit = {},
    onWebClick: () -> Unit = {}


){
    Row(modifier = modifier.fillMaxSize()) {
        BusinessList(
            businesses = businessList,
            onBusinessClick = onBusinessClick,
            onBackClick = onBackClick,
            modifier = Modifier.weight(1f)
        )

        selectedBusiness?.let { business ->
            BusinessDetailScreen(
                business = business,
                onBackClick = onBackClick,
                modifier = Modifier.weight(1.5f),
                onCallClick = {onCallClick()},
                onLocationClick = {onLocationClick()},
                onWebClick = {onWebClick()}
            )
        } ?: Box(modifier = Modifier.weight(1.5f)) {
            Text("Selecione um local", modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun BusinessListDetailAdaptivePreview(){
    val businesses = LocalBusinessProvider.getBusinessList(LocalContext.current)
    GuiaPATheme {
        BusinessListDetail(
            businessList = businesses,
            selectedBusiness = businesses.firstOrNull(),
            onBusinessClick = {},
            onBackClick = {}
        )
    }
}