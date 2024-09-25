package com.artrivera.businesscardapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BusinessCardScreen() {
    val brush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF1DB954),
            Color.Black
        )
    )

    Scaffold { innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(brush)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                BusinessCardTitle()
                Spacer(modifier = Modifier.height(100.dp))
                BusinessCardContactInfo()
            }
        }
    }
}


@Preview
@Composable
fun BusinessCardScreenPreview() {
    BusinessCardScreen()
}