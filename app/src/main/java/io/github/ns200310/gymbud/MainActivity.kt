package io.github.ns200310.gymbud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import compose.icons.AllIcons
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.Regular
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.brands.Google
import compose.icons.fontawesomeicons.brands.Microsoft
import compose.icons.fontawesomeicons.regular.Envelope
import io.github.ns200310.gymbud.ui.theme.GymBudTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GymBudTheme {
                Scaffold( modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background).padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                        Row (
                            modifier = Modifier.padding(5.dp)
                        ) {
                            LoginBtn(name = "Google", modifier = Modifier.fillMaxWidth(0.7f))
                        }
                        Row(
                            modifier = Modifier.padding(5.dp)
                        ) {
                            LoginBtn(name = "Outlook",  modifier = Modifier.fillMaxWidth(0.7f))
                        }
                        Row(
                            modifier = Modifier.padding(5.dp)
                        ) {
                            LoginBtn(name = "Email",  modifier = Modifier.fillMaxWidth(0.7f))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun LoginBtn(name:String, modifier: Modifier) {
    ElevatedButton(onClick = {  } , modifier = modifier) {

        Row (

            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
//            https://github.com/DevSrSouza/compose-icons
            if (name == "Google") {

                Icon(
                    imageVector = FontAwesomeIcons.Brands.Google,
                    contentDescription = "Google",
                    Modifier.fillMaxSize(0.1f)
                )
            }
            if (name == "Outlook") {

                Icon(
                    imageVector = FontAwesomeIcons.Brands.Microsoft,
                    contentDescription = "Microsoft",
                    Modifier.fillMaxSize(0.1f)
                )
            }
            if (name == "Email") {

                Icon(
                    imageVector = FontAwesomeIcons.Regular.Envelope,
                    contentDescription = "Mail",
                    Modifier.fillMaxSize(0.1f)
                )
            }
            Text(" Sign In with $name")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GymBudTheme {

    }
}