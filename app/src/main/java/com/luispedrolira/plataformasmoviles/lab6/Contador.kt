package com.luispedrolira.plataformasmoviles.lab6

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme

@Composable
fun CounterScreen(
    modifier: Modifier = Modifier
){
    CounterHeader()
    CounterStadistics()
    CounterFooter()
}

@Composable
private fun CounterHeader(
    modifier: Modifier = Modifier
){

}

@Composable
private fun CounterStadistics(
    modifier: Modifier = Modifier
){

}

@Composable
private fun CounterFooter(
    modifier: Modifier = Modifier
){

}


@Preview
@Composable
private fun PreviewCounterScreen() {
    Surface {
        PlataformasMovilesTheme {
            CounterScreen(modifier = Modifier.fillMaxSize())
        }
    }
}