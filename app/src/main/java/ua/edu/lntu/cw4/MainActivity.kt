package ua.edu.lntu.cw4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw4.ui.theme.IPZ_CR_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CR_4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ElementList()
                }
            }
        }
    }
}

@Composable
fun ElementList() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        repeat(3) {
            Element(index = it)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun Element(index: Int) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Елемент $index",
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = "Це елемент $index",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Кнопка $index")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ElementListPreview() {
    IPZ_CR_4Theme {
        ElementList()
    }
}
