package com.ktp.praktikum3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LandingPage(modifier : Modifier = Modifier) {
    Column{
        //Bagian TOP
        Row(modifier = modifier
            .fillMaxWidth()
            .height(125.dp)
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .height(120.dp)
                .width(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Column{
                    Text(text = "Hallo,",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Default,
                        color = Color.Blue,
                    )
                    Text(text = "welcome",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Default,
                        color = Color.Blue
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box(modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .background(color =Color.Blue),
                contentAlignment = Alignment.Center
            ) {

            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .clip(shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
            .background(color = Color.Blue),
            contentAlignment = Alignment.BottomCenter
        ) {

        }
    }
}