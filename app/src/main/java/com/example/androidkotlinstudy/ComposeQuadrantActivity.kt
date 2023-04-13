package com.example.androidkotlinstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidkotlinstudy.ui.theme.AndroidKotlinStudyTheme

class ComposeQuadrantActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AndroidKotlinStudyTheme {
        // A surface container using the 'background' color from the theme
        ComposableCardApp()
      }
    }
  }
}

@Composable
fun ComposableCard(title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier) {
  Column(
    modifier = modifier.fillMaxSize().background(backgroundColor).padding(16.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(text = title,
    fontWeight = FontWeight.Bold,
    modifier = Modifier.padding(bottom = 16.dp)
    )
    Text(text = description)
  }
}

@Composable
fun ComposableCardApp() {
  Column(Modifier.fillMaxWidth()) {
    Row(Modifier.weight(1f)) {
      ComposableCard(title = stringResource(id = R.string.title_text), description = stringResource(id = R.string.description_text), backgroundColor = Color.Green, modifier = Modifier.weight(1f))
      ComposableCard(title = stringResource(id = R.string.title_image), description = stringResource(
        id = R.string.description_image
      ), backgroundColor = Color.Yellow, modifier = Modifier.weight(1f))
    }
    Row(Modifier.weight(1f)) {
      ComposableCard(title = stringResource(id = R.string.title_row), description = stringResource(id = R.string.description_row), backgroundColor = Color.Blue, modifier = Modifier.weight(1f))
      ComposableCard(title = stringResource(id = R.string.title_column), description = stringResource(
        id = R.string.description_column
      ), backgroundColor = Color.LightGray, modifier = Modifier.weight(1f))
    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
  AndroidKotlinStudyTheme {
    ComposableCardApp()
  }
}