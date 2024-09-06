package com.luispedrolira.plataformasmoviles.lab7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme


@Composable
fun MyNotificationScreen(
    modifier: Modifier = Modifier
){
    MyNotification()
}

@Composable
private fun NotificationType(){

}

@Composable
private fun NotificationSection(){

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MyNotification(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(
                    text = "Notificaciones",
                    color = MaterialTheme.colorScheme.onPrimary
                ) },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        },
        containerColor = MaterialTheme.colorScheme.background.copy(alpha = 0.90f)
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            Text(
                text = "Tipos de notificaciones",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewMyNotificationScreen() {
    Surface {
        PlataformasMovilesTheme {
            MyNotificationScreen(modifier = Modifier.fillMaxSize())
        }
    }
}