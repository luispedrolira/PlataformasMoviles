package com.luispedrolira.plataformasmoviles.lab6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme

val CounterStateSaver: Saver<CounterState, Any> = listSaver(
    save = { listOf(it.counter, it.increments, it.decrements, it.maxValue, it.minValue, it.totalChanges) },
    restore = {
        CounterState(
            counter = it[0] as Int,
            increments = it[1] as Int,
            decrements = it[2] as Int,
            maxValue = it[3] as Int,
            minValue = it[4] as Int,
            totalChanges = it[5] as Int
        )
    }
)

@Composable
fun CounterScreen(
    modifier: Modifier = Modifier
) {
    var counterState by rememberSaveable(stateSaver = CounterStateSaver) {
        mutableStateOf(CounterState())
    }

    Column(modifier = modifier) {
        CounterHeader(
            modifier,
            counterState.counter,
            onDecrementClick = {
                counterState = counterState.copy(
                    counter = counterState.counter - 1,
                    decrements = counterState.decrements + 1,
                    minValue = if (counterState.counter - 1 < counterState.minValue || counterState.minValue == 0) {
                        counterState.counter - 1
                    } else {
                        counterState.minValue
                    },
                    totalChanges = counterState.increments + counterState.decrements + 1
                )
            },
            onIncrementClick = {
                counterState = counterState.copy(
                    counter = counterState.counter + 1,
                    increments = counterState.increments + 1,
                    maxValue = if (counterState.counter + 1 > counterState.maxValue) {
                        counterState.counter + 1
                    } else {
                        counterState.maxValue
                    },
                    totalChanges = counterState.increments + counterState.decrements + 1
                )
            }
        )
        CounterStadistics(
            modifier,
            counterState.increments,
            counterState.decrements,
            counterState.maxValue,
            counterState.minValue,
            counterState.totalChanges
        )
        CounterFooter()
    }
}

@Composable
private fun CounterHeader(
    modifier: Modifier = Modifier,
    counter: Int,
    onDecrementClick: () -> Unit,
    onIncrementClick: () -> Unit
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
                IconButton(onClick = onDecrementClick ) {
                    Icon(
                        Icons.Default.Remove,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }

            Text(
                text = counter.toString(),
                style = MaterialTheme.typography.displayLarge
            )

            Box(
                modifier = Modifier
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = CircleShape
                    )
            ) {
                IconButton(onClick = onIncrementClick) {
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
    modifier: Modifier = Modifier,
    increments: Int,
    decrements: Int,
    maxValue: Int,
    minValue: Int,
    totalChanges: Int
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        ItemStadistics(
            stadisticTitle = "Total incrementos:",
            stadisticValue = increments.toString()
        )
        ItemStadistics(
            stadisticTitle = "Total decrementos:",
            stadisticValue = decrements.toString()
        )
        ItemStadistics(
            stadisticTitle = "Valor máximo:",
            stadisticValue = maxValue.toString()
        )
        ItemStadistics(
            stadisticTitle = "Valor mínimo:",
            stadisticValue = minValue.toString()
        )
        ItemStadistics(
            stadisticTitle = "Total cambios:",
            stadisticValue = totalChanges.toString()
        )
        ItemStadistics(
            stadisticTitle = "Historial:",
            stadisticValue = ""
        )

        LazyVerticalGrid(columns = GridCells.Fixed(5)) {

        }

    }
}

@Composable
private fun ItemStadistics(
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

}



@Composable
private fun CounterFooter(
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = modifier
                .fillMaxWidth()
        ) {
            Text(text = "Reiniciar")
        }
    }
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