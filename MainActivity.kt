package com.example.mycalculator

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycalculator.ui.theme.MyCalculatorTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CalculatorLayout()
                }
            }
        }
    }
}

@Composable
fun CalculatorLayout(modifier: Modifier = Modifier) {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var res by remember { mutableStateOf("") }
    TextField(
        value = num1,
        singleLine = true,
        label = {Text("Enter Number 1")},
        onValueChange = {num1 = it},
        keyboardOptions = KeyboardOptions.Default.copy
            (keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done),
        modifier = Modifier.fillMaxWidth()

    )
    TextField(
        value = num2,
        singleLine = true,
        label = {Text("Enter Number 2")},
        onValueChange = {num2 = it},
        keyboardOptions = KeyboardOptions.Default.copy
            (keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done),
        modifier = Modifier.fillMaxWidth()

    )
    TextField(
        value = res,
        singleLine = true,
        label = {Text("$res")},
        onValueChange = {res = it},
        keyboardOptions = KeyboardOptions.Default.copy
            (keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done),
        modifier = Modifier.fillMaxWidth()
    )
    Column(modifier = modifier, verticalArrangement = Arrangement.Top,horizontalAlignment = AbsoluteAlignment.Left)
    {
    Button(onClick = {
        num1 = "1"
    }) {
        Text("1")
    }}
    Column(modifier = modifier, verticalArrangement = Arrangement.Top,horizontalAlignment = Alignment.CenterHorizontally)
    {
    Button(onClick = {
        num1 = "2"
    }) {
        Text("2")
    }}
    Column(modifier = modifier, verticalArrangement = Arrangement.Top,horizontalAlignment = AbsoluteAlignment.Right)
    {
        Button(onClick = {
            num1 = "3"
        }) {
            Text("3")
        }}
    Spacer(modifier = Modifier.height(60.dp))
    Column(modifier = modifier, verticalArrangement = Arrangement.Center,horizontalAlignment = AbsoluteAlignment.Left)
    {
        Button(onClick = {
            num1 = "4"
        }) {
            Text("4")
        }}
    Column(modifier = modifier, verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally)
    {
        Button(onClick = {
            num1 = "5"
        }) {
            Text("5")
        }}
    Column(modifier = modifier, verticalArrangement = Arrangement.Center,horizontalAlignment = AbsoluteAlignment.Right)
    {
        Button(onClick = {
            num1 = "6"
        }) {
            Text("6")
        }}
    Spacer(modifier = Modifier.height(60.dp))
    Column(modifier = modifier, verticalArrangement = Arrangement.Bottom,horizontalAlignment = AbsoluteAlignment.Left)
    {
        Button(onClick = {
            num1 = "7"
        }) {
            Text("7")
        }}
    Column(modifier = modifier, verticalArrangement = Arrangement.Bottom,horizontalAlignment = Alignment.CenterHorizontally)
    {
        Button(onClick = {
            num1 = "8"
        }) {
            Text("8")
        }}
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(30.dp),horizontalAlignment = AbsoluteAlignment.Right)
    {
        Button(onClick = {
            num1 = "9"
        }) {
            Text("9")
        }}
    Spacer(modifier = Modifier.height(60.dp))
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(30.dp),horizontalAlignment = AbsoluteAlignment.Right)
    {
        Button(onClick = {
            num1 = "0"
        }) {
            Text("0")
        }}


}







@Preview(showBackground = true)
@Composable
fun CalculatorLayoutPreview() {
    CalculatorLayout()
}