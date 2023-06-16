package dev.rohith.kmm_sample.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.rohith.kmm_sample.ActivityDetailAnalytics
import dev.rohith.kmm_sample.AnalyticsEvent
import dev.rohith.kmm_sample.Greeting
import dev.rohith.kmm_sample.getAnalyticsReporter
import java.util.UUID

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable {
                            val androidReporter = getAnalyticsReporter()
                            ActivityDetailAnalytics(androidReporter).reportViewActivity(
                                UUID
                                    .randomUUID()
                                    .toString(),
                                UUID
                                    .randomUUID()
                                    .toString(),
                            )
                        },
                    color = MaterialTheme.colors.background
                ) {
                    GreetingView(Greeting().greet())
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
