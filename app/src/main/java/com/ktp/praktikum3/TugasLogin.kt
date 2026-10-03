package com.ktp.praktikum3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LandingPage(modifier: Modifier = Modifier) {
    Column{
        //Bagian TOP
        Column(modifier = modifier
            .fillMaxWidth()
            .height(125.dp)
        ) {
            Box(modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(color =Color.Blue),
                contentAlignment = Alignment.Center
            ) {}
        }
    }
}