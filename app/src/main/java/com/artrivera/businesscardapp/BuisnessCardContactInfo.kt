package com.artrivera.businesscardapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BusinessCardContactInfo() {
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Call, contentDescription = "Phone", tint = Color.White)
            Text(
                stringResource(R.string.my_phone_number), modifier = Modifier.padding(
                    horizontal = 8.dp
                ),
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White)

            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Email, contentDescription = "Phone", tint = Color.White)
            Text(
                stringResource(R.string.my_email),
                modifier = Modifier.padding(
                    horizontal = 8.dp
                ),
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White)
            )
        }
    }
}

@Preview()
@Composable
fun BusinessCardContactInfoPreview() {
    BusinessCardContactInfo()
}