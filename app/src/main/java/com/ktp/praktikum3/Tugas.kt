package com.ktp.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LandingPage(modifier : Modifier = Modifier) {
    val logo = painterResource(id = R.drawable.logo)
    val user = painterResource(id = R.drawable.user)
    val fotobg = painterResource(id = R.drawable.fotobg)
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
                .clip(shape = RoundedCornerShape(25.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = logo,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(108.dp)
                        .clip(CircleShape)
                        .border(
                            width = 3.dp,
                            color = Color.Blue,
                            shape = CircleShape)
                )
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .clip(shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
            .paint(
                painter = fotobg,
                contentScale = ContentScale.Crop
            ),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(modifier = modifier
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Let's Login to Join with Us",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Default,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(5.dp))
                Image(painter = user,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(225.dp)
                        .clip(CircleShape)
                        .border(
                            width = 10.dp,
                            color = Color.White,
                            shape = CircleShape)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Muhammad Rio Aprilianto",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "20240140204",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Default,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(start = 20.dp, end = 20.dp),
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Blue
                    )
                ) {
                    Text(
                        text = "Continue",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}