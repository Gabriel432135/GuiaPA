package com.example.guiapa.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Web
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.guiapa.data.LocalBusinessProvider
import com.example.guiapa.model.Business
import com.example.guiapa.ui.theme.AppTheme
import com.example.guiapa.ui.theme.GuiaPATheme

@Composable
fun BusinessDetailScreen(modifier: Modifier = Modifier, business: Business, onBackClick: () -> Unit){

    val scrolState = rememberScrollState()
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val halfScreenHeight = screenHeight / 2


    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrolState)
    ){
        Image(
            painter = painterResource(business.imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(halfScreenHeight),
            contentScale = ContentScale.Crop,
        )

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(AppTheme.dimensions.paddingMedium)
        ){
            // NOME: Título principal
            Text(
                text = business.name,
                style = MaterialTheme.typography.headlineMedium
            )

            // DESCRIÇÃO: Corpo do texto
            Text(
                text = business.description,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(vertical = AppTheme.dimensions.paddingMedium)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(AppTheme.dimensions.paddingSmall)
            ){
                IconButton(
                    onClick = {},
                    icon = Icons.Default.Phone,
                    contentDescription = "Ligar",
                    contentText = "Ligar"
                )
                IconButton(
                    onClick = {},
                    icon = Icons.Default.LocationOn,
                    contentDescription = "Endereço",
                    contentText = "Endereço"
                )
                IconButton(
                    onClick = {},
                    icon = Icons.Default.Web,
                    contentDescription = "Site",
                    contentText = "Site"
                )
            }


            // ENDEREÇO: Label informativo
            Text(
                text = business.address,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant // Cor mais suave para info secundária
            )

            // CONTATOS: Texto menor/auxiliar
            Text(
                text = "${business.phone} • ${business.website}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary // Destaque em cor para link/contato
            )
        }
    }
}


@Composable
fun RowScope.IconButton(onClick: ()-> Unit, icon: ImageVector, contentDescription: String? = null, contentText: String, weight: Float = 1f){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = AppTheme.dimensions.paddingSmall)
            .clip(AppTheme.shape.large)
            .background(color = MaterialTheme.colorScheme.surfaceVariant)
            .clickable { onClick() }
            .padding(horizontal = AppTheme.dimensions.paddingMedium, vertical = AppTheme.dimensions.paddingSmall)
            .weight(weight),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(Modifier.width(AppTheme.dimensions.paddingSmall))
        Text(
            text = contentText,
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 1
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessDetailScreenPreview() {
    GuiaPATheme {
        BusinessDetailScreen(business = LocalBusinessProvider.getBusinessList(LocalContext.current)[0], onBackClick = {})
    }
}