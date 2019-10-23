package de.diskostu.android.composedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    Text(text = "A day in Shark Fin Cove")
    Text(text = "Davenport, California")
    Text(text = "December 2018")
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        NewsStory()
    }
}