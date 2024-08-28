package com.luispedrolira.plataformasmoviles.lab7

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme


@Composable
fun MyNotificationScreen(
    modifier: Modifier = Modifier
){

}


@Composable
private fun NotificationType(){

}

@Composable
private fun NotificationSection(){

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