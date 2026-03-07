package com.example.guiapa.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoFixHigh
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Construction
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.HealthAndSafety
import androidx.compose.material.icons.filled.HomeRepairService
import androidx.compose.material.icons.filled.LocalGroceryStore
import androidx.compose.material.icons.filled.LocalMovies
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.TheaterComedy
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.guiapa.ui.theme.AppTheme
import com.example.guiapa.ui.theme.GuiaPATheme

@Composable
fun BusinessCategoryList(modifier: Modifier = Modifier){
    val scrolState = rememberScrollState()
    Column(
        verticalArrangement = Arrangement.spacedBy(AppTheme.dimensions.paddingMedium),
        modifier = modifier
            .verticalScroll(scrolState)
            .fillMaxSize()
            .padding(AppTheme.dimensions.paddingMedium)
    ){
        Row(horizontalArrangement = Arrangement.spacedBy(AppTheme.dimensions.paddingMedium)) {
            IconCategoryButton(
                onClick = {},
                icon = Icons.Default.Fastfood,
                contentDescription = "Restaurantes e Lanchonetes",
                contentText = "Restaurantes e Lanchonetes"
            )
            IconCategoryButton(
                onClick = {},
                icon = Icons.Default.AutoFixHigh,
                contentDescription = "Saúde e Beleza",
                contentText = "Saúde e Beleza"
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(AppTheme.dimensions.paddingMedium)) {
            IconCategoryButton(
                onClick = {},
                icon = Icons.Default.LocalGroceryStore,
                contentDescription = "Compras e Varejo",
                contentText = "Compras e Varejo"
            )
            IconCategoryButton(
                onClick = {},
                icon = Icons.Default.HomeRepairService,
                contentDescription = "Serviços",
                contentText = "Serviços"
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(AppTheme.dimensions.paddingMedium)){
            IconCategoryButton(
                onClick = {},
                icon = Icons.Default.TheaterComedy,
                contentDescription = "Entretenimento e Lazer",
                contentText = "Entretenimento e Lazer"
            )
            IconCategoryButton(
                onClick = {},
                icon = Icons.Default.Construction,
                contentDescription = "Reformas e Construção",
                contentText = "Reformas e Construção"
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCategoryListPreview() {
    GuiaPATheme {
        BusinessCategoryList()
    }
}

@Composable
fun RowScope.IconCategoryButton(
    onClick: () -> Unit,
    icon: ImageVector,
    contentDescription: String? = null,contentText: String,
) {
    Column(
        modifier = Modifier
            .weight(1f)
            .aspectRatio(1f)
            .clip(AppTheme.shape.large)
            .background(color = MaterialTheme.colorScheme.surfaceVariant)
            .clickable { onClick() }
            .padding(AppTheme.dimensions.paddingMedium),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(56.dp)
        )
        Spacer(Modifier.height(AppTheme.dimensions.paddingSmall))
        Text(
            text = contentText,
            style = MaterialTheme.typography.labelLarge,
            textAlign = TextAlign.Center,
            maxLines = 2
        )
    }
}