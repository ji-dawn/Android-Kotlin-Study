package com.example.androidkotlinstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidkotlinstudy.ui.theme.AndroidKotlinStudyTheme

class TaskManagerActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AndroidKotlinStudyTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          TaskMangerApp()
        }
      }
    }
  }
}

@Composable
fun TaskCompleteScreen(image: Painter, firstText: String, secondText: String) {
  Column(
    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Image(painter = image, contentDescription = null)
    Text(
      text = firstText,
      fontWeight = FontWeight.Bold,
      modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
    )
    Text(
      text = secondText,
      fontSize = 16.sp
    )
  }

}

@Composable
fun TaskMangerApp() {
  TaskCompleteScreen(image = painterResource(id = R.drawable.ic_task_completed), firstText = stringResource(
    id = R.string.task_complete
  ), secondText = stringResource(id = R.string.nice_work))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
  AndroidKotlinStudyTheme {
    Surface {
      TaskMangerApp()
    }
  }
}