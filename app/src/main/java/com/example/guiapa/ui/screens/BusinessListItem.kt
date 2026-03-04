package com.example.guiapa.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.guiapa.data.LocalBusinessProvider
import com.example.guiapa.model.Business
import com.example.guiapa.ui.theme.AppTheme
import com.example.guiapa.ui.theme.GuiaPATheme

@Composable
fun BusinessCard(modifier: Modifier = Modifier, business: Business) {
    Card(modifier = modifier) {
        Column(modifier = Modifier) {
            Image(
                painter = painterResource(business.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(AppTheme.dimensions.imageHeight),
                contentScale = ContentScale.Crop,
            )

            // Container para os textos com padding interno
            Column(modifier = Modifier.padding(AppTheme.dimensions.paddingMedium)) {

                // NOME: Título principal
                Text(
                    text = business.name,
                    style = MaterialTheme.typography.titleLarge
                )

                // DESCRIÇÃO: Corpo do texto
                Text(
                    text = business.description,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(vertical = AppTheme.dimensions.paddingSmall)
                )

                // ENDEREÇO: Label informativo
                Text(
                    text = business.address,
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant // Cor mais suave para info secundária
                )

                // CONTATOS: Texto menor/auxiliar
                Text(
                    text = "${business.phone} • ${business.website}",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary // Destaque em cor para link/contato
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessPreview() {
    GuiaPATheme {
        BusinessCard(business = LocalBusinessProvider.getBusinessList(LocalContext.current)[0])
    }
}