package com.sliderzxc.compose.designs.bazar.onboarding

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sliderzxc.compose.designs.R

@Composable
fun OnBoardingFirstScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Skip",
            color = Color(0xFF54408C),
            modifier = Modifier
                .padding(top = 16.dp, start = 16.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            fontWeight = FontWeight(500),
            fontSize = TextUnit(14f, TextUnitType.Sp),
        )
        Spacer(modifier = Modifier.size(12.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.onboarding1),
                contentDescription = "OnBoarding Image 1"
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Now reading books\nwill be easier",
                    fontSize = 24.sp,
                    lineHeight = 32.4.sp,
                    fontFamily = FontFamily(Font(R.font.open_sans)),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF121212),
                    modifier = Modifier.padding(horizontal = 66.dp),
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = " Discover new worlds, join a vibrant reading community. Start your reading adventure effortlessly with us.",
                    modifier = Modifier.padding(horizontal = 44.dp),
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontFamily = FontFamily(Font(R.font.roboto)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFA6A6A6),
                    textAlign = TextAlign.Center,
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.positive_onboarding_indicator),
                    contentDescription = "positive page indicator",
                    modifier = Modifier.size(10.dp)
                )

                Spacer(modifier = Modifier.width(3.dp))

                Image(
                    painter = painterResource(id = R.drawable.negative_onboarding_indicator),
                    contentDescription = "negative page indicator",
                    modifier = Modifier.size(6.dp)
                )

                Spacer(modifier = Modifier.width(3.dp))

                Image(
                    painter = painterResource(id = R.drawable.negative_onboarding_indicator),
                    contentDescription = "negative page indicator",
                    modifier = Modifier.size(6.dp)
                )
            }


            Column(
                modifier = Modifier.padding(horizontal = 24.dp),
            ) {
                Button(
                    modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color(0xFF54408C)),
                    shape = RoundedCornerShape(size = 12.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Continue",
                        color = Color.White,
                        letterSpacing = 0.3.sp,
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily(Font(R.font.open_sans)),
                        fontWeight = FontWeight(700),
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFAF9FD)),
                    shape = RoundedCornerShape(size = 12.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Sign in",
                        color = Color(0xFF54408C),
                        letterSpacing = 0.3.sp,
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily(Font(R.font.open_sans)),
                        fontWeight = FontWeight(700),
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewOnBoardingFirstScreen() {
    OnBoardingFirstScreen()
}