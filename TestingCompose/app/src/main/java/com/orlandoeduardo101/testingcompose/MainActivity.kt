package com.orlandoeduardo101.testingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.orlandoeduardo101.testingcompose.ui.theme.TestingComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestingComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Magenta.copy(alpha = 0.6f)) {
        Box(modifier = Modifier, contentAlignment = Alignment.Center) {
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    text = "Hi, my name is $name!",
                    modifier = modifier.padding(24.dp)
                );
                Text(
                    text = "Text 1 Column!",
                    modifier = modifier.padding(24.dp)
                );
                Row {
                    Text(
                        text = "Text 2 Row!",
                        modifier = modifier.padding(24.dp)
                    );
                    Text(
                        text = "Text 3 Row!",
                        modifier = modifier.padding(24.dp)
                    );
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestingComposeTheme {
        Greeting("Android")
    }
}