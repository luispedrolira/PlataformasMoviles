package com.luispedrolira.plataformasmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.luispedrolira.plataformasmoviles.lab5.PantallaBasicFrontEnd
import com.luispedrolira.plataformasmoviles.lab6.CounterScreen
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlataformasMovilesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}