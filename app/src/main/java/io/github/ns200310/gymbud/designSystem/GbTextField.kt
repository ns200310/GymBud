package io.github.ns200310.gymbud.designSystem


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

/**
@author Nithika Senaweeera
 **/


@Composable
fun GbTextField(
    modifier: Modifier = Modifier,
    txtState: TextFieldState,
    tip: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    isPwd: Boolean = false,
    frontIcon: ImageVector? = null,
    onfrontObjClick: () -> Unit = {},
    onBackObjClick: () -> Unit = {},
    backIcon: ImageVector? = null,
    backText: String,


    ) {
    if (isPwd) { // Password Input Render

    } else { // Password Input Render

    }


}


@Composable
fun TxtField(
    modifier: Modifier = Modifier,
    txtState: TextFieldState,
    tip: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    frontIcon: ImageVector? = null,
    onfrontObjClick: () -> Unit = {},
    onBackObjClick: () -> Unit = {},
    backIcon: ImageVector? = null,
    backText: String,
) {
    BasicTextField(
        modifier = modifier,
        state = txtState,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        lineLimits = TextFieldLineLimits.SingleLine,
        cursorBrush =  SolidColor(MaterialTheme.colorScheme.primary),
        textStyle = LocalTextStyle.current.copy(
            color = MaterialTheme.colorScheme.onBackground
        ),
        decorator = {
            fanny ->
            Column {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    // front icon logic
                    if (frontIcon != null){
                        Icon(
                            // clickable state
                            modifier = Modifier.clickable { onfrontObjClick() },
                            imageVector = frontIcon,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.5f),

                        )
                        Spacer(modifier = Modifier.width(17.dp))
                    }


                    Box(
                        modifier = Modifier.weight(1f)
                    )
                    {
                        if (txtState.text.isEmpty()){
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = tip,
                                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.4f),
                            )
                        }
                        fanny()
                    }

                    // Back Icon logic
                    if (backIcon != null){
                        Icon(
                            modifier = Modifier.clickable { onBackObjClick() },
                            imageVector = backIcon,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(0.5f),

                            )

                    } else {
                        if (backText !== "") {
                            Text(
                                modifier = Modifier.clickable { onBackObjClick() }.padding(end = 4.dp),
                                text = backText,
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.W700,

                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))


                    HorizontalDivider(modifier = Modifier.alpha(0.7f))

                }

            }
        },

    )
}