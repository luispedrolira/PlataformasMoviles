package com.luispedrolira.plataformasmoviles.lab4


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luispedrolira.plataformasmoviles.R
import com.luispedrolira.plataformasmoviles.ui.theme.PlataformasMovilesTheme

@Composable
fun BackgroundImage() {
    Box(modifier = Modifier.fillMaxSize()){
        val url_image: Painter = painterResource(id = R.drawable.logo_uvg)

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(60.dp)
        ){
            Image(
                painter = url_image,
                contentDescription = "Logo UVG",
                modifier = Modifier
                    .fillMaxSize()
                    .alpha(0.2f)
            )
        }

    }
}

@Composable
fun CaratulaUVG(modifier: Modifier = Modifier){

    BackgroundImage()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .border(7.dp, Color(0xFF126e22))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Text(
                text = "Universidad del Valle",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold
            )
        }
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Text(
                text = "de Guatemala",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold
            )
        }

        /*ESPACIO SEPARADOR*/
        Spacer(modifier = Modifier.height(40.dp))
        /*ESPACIO SEPARADOR*/

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Text(
                text = "Programación de plataformas",
                style = MaterialTheme.typography.headlineSmall
            )

        }
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Text(
                text = "móviles, Sección 30",
                style = MaterialTheme.typography.headlineSmall
            )

        }

        /*ESPACIO SEPARADOR*/
        Spacer(modifier = Modifier.height(16.dp))
        /*ESPACIO SEPARADOR*/

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.padding(end = 50.dp)){
                Text("INTEGRANTES",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )

            }
            Box(modifier = Modifier){
                Column {
                    Text("Luis Pedro Lira")
                    Text("Cristiano Ronaldo")
                    Text("LeBron James")
                }
            }
        }


        Spacer(modifier = Modifier.height(36.dp))


        Row(){
            Box(modifier = Modifier.padding(end = 50.dp)){
                Text("CATEDRÁTICO",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold)

            }
            Box(modifier = Modifier){
                Text("Juan Carlos Durini")

            }
        }


        Spacer(modifier = Modifier.height(70.dp))


        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Luis Pedro Lira")
            Text("23669")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun CaratulaUVGPreview() {
    PlataformasMovilesTheme {
        CaratulaUVG()
    }
}

@Preview(showBackground = true)
@Composable
fun BackgroundImagePreview() {
    PlataformasMovilesTheme {
        BackgroundImage()
    }
}