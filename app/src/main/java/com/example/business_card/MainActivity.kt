package com.example.business_card

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.business_card.ui.theme.Business_CardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Surface
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size
import android.R.attr.content
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import com.example.business_card.ui.theme.Pink40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Business_CardTheme {
                Scaffold(
                    bottomBar = { Contact() },
                    containerColor = Color(0xFF2D3142)
                ){
                    innerPadding ->
                        Intro(Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun Intro(modifier:Modifier=Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id=R.drawable.ela),
            contentDescription = null
        )
        Text(
            text="Ela ben khedher",
            fontSize =50.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            text="Full Stack Developer",
            fontSize =20.sp,
            fontWeight = FontWeight.Bold ,
            color= Color(0xFFBFC0C0)
        )
    }
}

@Composable
fun Contact(modifier:Modifier=Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
            .padding(50.dp),

        ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
        ) {
            Row(
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.appel_telephonique),
                    modifier = Modifier
                        .size(20.dp)
                        .padding(end = 8.dp),
                    tint = Color(0xFFEF8354),
                    contentDescription = null
                )
                Text(
                    text = "96 079 666",
                    fontSize = 10.sp,
                )
            }
            Row(
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .padding(end = 8.dp),
                    tint = Color(0xFFEF8354),


                    )
                Text(
                    text = " elabenkedher@gmail.com",
                    fontSize = 10.sp,
                )
            }
            Row(
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.site_internet),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .padding(end = 8.dp),
                    tint = Color(0xFFEF8354),

                    )
                Text(
                    text = "ela_ben_khedher",
                    fontSize = 10.sp,
                )
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Business_CardTheme {
        Contact()
    }
    }