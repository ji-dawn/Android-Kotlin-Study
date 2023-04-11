package com.example.androidkotlinstudy

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidkotlinstudy.ui.theme.AndroidKotlinStudyTheme

class TextManagerActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AndroidKotlinStudyTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
          ArticleApp()
        }
      }
    }
  }
}

@Composable
fun Article(
  image: Painter,
  headline: String,
  outline: String,
  mainText: String,
) {
  Column() {
    Image(painter = image, contentDescription = null)
    Text(
      text = headline,
      fontSize = 24.sp,
      modifier = Modifier.padding(16.dp)
    )
    Text(
      text = outline,
      modifier = Modifier.padding(start = 16.dp, end = 16.dp),
      textAlign = TextAlign.Justify
    )
    Text(
      text = mainText,
      modifier = Modifier.padding(16.dp),
      textAlign = TextAlign.Justify
    )
  }
}

@Composable
fun ArticleApp() {
  Article(
    image = painterResource(id = R.drawable.bg_compose_background),
    headline = stringResource(id = R.string.tutorial_headline),
    outline = stringResource(id = R.string.tutorial_outline),
    mainText = stringResource(id = R.string.tutorial_main)
  )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  AndroidKotlinStudyTheme {
    Surface {
      ArticleApp()
    }
  }
}