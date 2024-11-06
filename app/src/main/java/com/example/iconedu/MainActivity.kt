package com.example.iconedu

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.iconedu.ui.theme.IconEduTheme

const val TAG = "MainActivity"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IconEduTheme {
                Surface (
                    modifier = Modifier.fillMaxSize()
                ){
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        BasicIconButton()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun BasicIcon(modifier: Modifier = Modifier){
    Icon(
        imageVector = Icons.Default.Add,
        contentDescription = "Add",
        modifier = modifier
            .size(50.dp),
        tint = Color.Blue
    )
}

@Preview
@Composable
fun BasicIconButton(modifier: Modifier = Modifier){
    IconButton(
        onClick = {
            Log.d(TAG, "BasicIconButton: click")
        }
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add"
        )
    }
}