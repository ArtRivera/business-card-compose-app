package com.artrivera.businesscardapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BusinessCardTitle() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable._0210721_130331__1_),
            contentDescription = "My Picture",
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topEnd = 16.dp,
                        topStart = 16.dp,
                        bottomEnd = 16.dp,
                        bottomStart = 16.dp
                    )
                )
                .width(220.dp)

        )
        Text(
            "Arturo Rivera",
            style = MaterialTheme.typography.titleLarge.copy(color = Color.White),
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Android Engineer", style = MaterialTheme.typography.bodyMedium.copy(color = Color.White))
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Icon(Icons.Filled.LocationOn, contentDescription = "Location", tint = Color.White)
            Text("CDMX \uD83C\uDDF2\uD83C\uDDFD", style = MaterialTheme.typography.bodyMedium.copy(color = Color.White))
        }
    }

}

@Preview(showBackground = false)
@Composable
fun BusinessCardTitlePreview() {
    BusinessCardTitle()
}