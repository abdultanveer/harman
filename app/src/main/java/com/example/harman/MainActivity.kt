package com.example.harman

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.harman.ui.theme.HarmanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HarmanTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "abdul", from = "android",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from:String,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
    )  {
        Text(
            text = "Happy birthday " + message, modifier = modifier,
            fontSize = 100.sp,
            lineHeight = 116.sp,
        )
        Text(text = from,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End))
    }


}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HarmanTheme {
    GreetingText(message = "Harman","android")
    }
}

