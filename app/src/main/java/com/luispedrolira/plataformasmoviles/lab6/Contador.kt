package com.luispedrolira.plataformasmoviles.lab6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme

@Composable
fun CounterScreen(
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        CounterHeader()
        CounterStadistics()
        CounterFooter()
    }

}

@Composable
private fun CounterHeader(
    modifier: Modifier = Modifier
){
    //var contador_string = ""

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Luis Pedro Lira",
            style = MaterialTheme.typography.displaySmall
        )
        Row (
            modifier = Modifier
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                modifier = Modifier
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    )
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Default.Add,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }

            Text(
                text = "5",
                style = MaterialTheme.typography.displayLarge
            )

            Box(
                modifier = Modifier
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    )
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Default.Add,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }

        }
    }
}

@Composable
private fun CounterStadistics(
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        ContentStadistics(
            stadisticTitle = "Total incrementos:",
            stadisticValue = "7"
        )
        ContentStadistics(
            stadisticTitle = "Total decrementos:",
            stadisticValue = "2"
        )
        ContentStadistics(
            stadisticTitle = "Valor máximo:",
            stadisticValue = "5"
        )
        ContentStadistics(
            stadisticTitle = "Valor mínimo:",
            stadisticValue = "1"
        )
        ContentStadistics(
            stadisticTitle = "Total cambios:",
            stadisticValue = "9"
        )
        ContentStadistics(
            stadisticTitle = "Historial:",
            stadisticValue = ""
        )

        LazyRow {

        }

    }
}

@Composable
private fun ContentStadistics(
    modifier: Modifier = Modifier,
    stadisticTitle: String,
    stadisticValue: String
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 56.dp, top = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stadisticTitle,
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = stadisticValue,
            style = MaterialTheme.typography.headlineSmall
        )
    }
}

@Composable
private fun HistoryValues(

){
    //TODO: Valores del historial
}



@Composable
private fun CounterFooter(
    modifier: Modifier = Modifier
){

}


@Preview
@Composable
private fun PreviewCounterScreen() {
    PlataformasMovilesTheme {
        Surface {
            CounterScreen(modifier = Modifier.fillMaxSize())
        }
    }
}