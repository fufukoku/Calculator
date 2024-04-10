package com.example.mycalculator

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
    var input by remember { mutableStateOf("") }
    var output by remember { mutableStateOf("") }
    var outputNum: Double = 0.0
    var symbol1 by remember { mutableStateOf("0") }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(30.dp),
        horizontalAlignment = AbsoluteAlignment.Right
    )
    {
        Box(modifier = Modifier)
        {
            Text(text = output)
        }

        Row {
            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = AbsoluteAlignment.Right
            )
            {
                Button(onClick = {
                    input += "1"
                    output += "1"
                }) {
                    Text("1")
                }

                Button(onClick = {
                    input += "4"
                    output += "4"
                }) {
                    Text("4")
                }

                Button(onClick = {
                    input += "7"
                    output += "7"
                }) {
                    Text("7")
                }
                Button(onClick = {
                    input += "."
                    output += "."
                }) {
                    Text(".")
                }

            }

            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = AbsoluteAlignment.Right
            )
            {
                Button(onClick = {
                    input += "2"
                    output += "2"
                }) {
                    Text("2")
                }

                Button(onClick = {
                    input += "5"
                    output += "5"
                }) {
                    Text("5")
                }

                Button(onClick = {
                    input += "8"
                    output += "8"
                }) {
                    Text("8")
                }
                Button(onClick = {
                    input += "0"
                    output += "0"
                }) {
                    Text("0")
                }

            }

            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = AbsoluteAlignment.Right
            )
            {
                Button(onClick = {
                    input += "3"
                    output += "3"
                }) {
                    Text("3")
                }

                Button(onClick = {
                    input += "6"
                    output += "6"
                }) {
                    Text("6")
                }

                Button(onClick = {
                    input += "9"
                    output += "9"
                }) {
                    Text("9")
                }
                Button(onClick =
                {
                    num2 = input
                when(symbol1)
                {
                    "1" -> outputNum = num1.toDouble() + num2.toDouble()
                    "2" -> outputNum = num1.toDouble() - num2.toDouble()
                    "3" -> outputNum = num1.toDouble() * num2.toDouble()
                    "4" -> outputNum = num1.toDouble() / num2.toDouble()
                }
                    output = outputNum.toString()

                }) {
                    Text("=")
                }


            }
            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = AbsoluteAlignment.Right
            )
            {

                Button(onClick = {
                    num1 = input
                    input = ""
                    output += "+"
                    symbol1 = "1"
                }) {
                    Text("+")
                }

                Button(onClick = {
                    num1 = input
                    input = ""
                    output += "-"
                    symbol1 = "2"
                }) {
                    Text("-")
                }

                Button(onClick = {
                    num1 = input
                    input = ""
                    output += "*"
                    symbol1 = "3"
                }) {
                    Text("*")
                }
                Button(onClick = {
                    num1 = input
                    input = ""
                    output += "/"
                    symbol1 = "4"
                }) {
                    Text("/")
                }

            }

        }
}
}

@Preview(showBackground = true)
@Composable
fun CalculatorLayoutPreview() {
    CalculatorLayout()
}