package com.sliderzxc.compose.designs.bazar.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.sliderzxc.compose.designs.R

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF54408C))
    ) {
        Image(
            painter = painterResource(id = R.drawable.app_big_logo),
            contentDescription = "Big logo",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
                .width(315.dp)
                .height(315.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .fillMaxHeight(0.5f),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.logo_bazar),
                contentDescription = "Application Logo",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Bazar.",
                color = Color.White,
                fontSize = TextUnit(32f, TextUnitType.Sp),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview() {
    SplashScreen()
}