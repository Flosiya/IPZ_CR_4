package ua.edu.lntu.cw4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen1(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "Ви знаходитесь на екрані 1",
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(38.dp)
        )
        Button(
            onClick = {
                onClick()
            }) {
            Text(
                text = "Перехід на екран 2" )
        }
    }
}

@Composable
fun Screen2(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "Ви знаходитесь на екрані 2",
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(38.dp))
        Button(
            onClick = {
                onClick()
            }) {
            Text(
                text = "Перехід на екран 3" )
        }
    }
}

@Composable
fun Screen3(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "Ви знаходитесь на екрані 3",
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(38.dp))
        Button(
            onClick = {
                onClick()
            }) {
            Text(
                text = "Перехід на екран 1" )
        }
    }
}