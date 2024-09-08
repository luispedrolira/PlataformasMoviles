package com.luispedrolira.plataformasmoviles.lab8.rickAndMortyHome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Titulo Rick And Morty")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Entrar")
        }

        Column(
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = "Luis Pedro Lira - 23669"
            )
        }
        
    }
}

@Preview
@Composable
private fun PreviewHomeScreen() {
    PlataformasMovilesTheme {
        Surface {
            HomeScreen(modifier = Modifier.fillMaxSize())
        }
    }
}