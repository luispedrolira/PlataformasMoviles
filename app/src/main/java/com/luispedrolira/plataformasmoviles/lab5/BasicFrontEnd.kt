package com.luispedrolira.plataformasmoviles.lab5

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.Update
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme


@Composable
fun PantallaBasicFrontEnd(
    modifier: Modifier = Modifier
){
    BasicFrontEnd()
}
@Composable
private fun BasicFrontEnd(
    modifier: Modifier = Modifier
){
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {
        UpdateHeader(
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp),
            onDownloadClick = {
                val playstoreIntent = Intent(ACTION_VIEW)
                playstoreIntent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.whatsappLinks")
                context.startActivity(playstoreIntent)
            }
        )

        TitleHeader(
            modifier = Modifier
                .fillMaxWidth()
        )

        ContentCard(
            name = "Fridays",
            address = "Dirección: 8 calle 26-55, Zona 11",
            schedule = "12pm - 10pm",
            onStartClick = {
                Toast.makeText(context, "Luis PedrO Lira", Toast.LENGTH_LONG).show()
            },
            onDetailsClick = {
                Toast.makeText(context, "Tipo de comida: Americana\nPrecios: QQ", Toast.LENGTH_LONG).show()
            },
            onDirectionsClick = {
                val googleMapsPinIntent = Intent(ACTION_VIEW)
                googleMapsPinIntent.data = Uri.parse("https://maps.app.goo.gl/KrdRREsiN8eFkkgj6")
            },
            modifier = Modifier
                .padding(16.dp)
        )
    }

}



@Composable
private fun UpdateHeader(
    modifier: Modifier = Modifier,
    onDownloadClick: () -> Unit
){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Box(modifier = Modifier
            .size(48.dp)
            .background(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = CircleShape
            ),
            contentAlignment = Alignment.Center
        ){
            Icon(
                Icons.Default.Refresh,
                contentDescription = null,

            )
        }

        Text(text = "Actualización disponible",
            style = MaterialTheme.typography.bodyLarge
            )
        TextButton(onClick = onDownloadClick) {
            Text(text = "Descargar")
        }

    }
}

@Composable
private fun TitleHeader(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column(
        ) {
            Text(
                text = "Viernes",
                style = MaterialTheme.typography.displayMedium,
                color = Color(0xFF4a4a4a)
            )
            Text(
                text = "1 de marzo",
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xFF4a4a4a)
            )
        }

        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(
                text = "Terminar jornada",
                color = Color(0xFF7624dd)
            )
        }
    }
}


@Composable
private fun ContentCard(
    name: String,
    address: String,
    schedule: String,
    onStartClick: () -> Unit,
    onDetailsClick: () -> Unit,
    onDirectionsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = name,
                    style = MaterialTheme.typography.headlineLarge
                )
                IconButton(onClick = onDirectionsClick) {
                    Icon(
                        Icons.Default.Info,
                        contentDescription = null
                    )
                }
            }
            Text(
                text = address,
                style  = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = schedule,
                style  = MaterialTheme.typography.labelMedium
            )
            Row {
                Button(
                    onClick = onStartClick,
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Iniciar")
                }
                TextButton(
                    onClick = onDetailsClick,
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Detalles")
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewPantallaBasicFrontEnd() {
    PlataformasMovilesTheme {
        Surface {
            PantallaBasicFrontEnd()
        }
    }
}
