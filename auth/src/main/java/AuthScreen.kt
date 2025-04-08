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
import cafe.adriel.voyager.core.registry.rememberScreen
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class AuthScreen : Screen {
    @Composable
    override fun Content() {
        AuthScreenComposable()
    }
}

@Composable
private fun AuthScreenComposable() {
    val navigator = LocalNavigator.currentOrThrow
    val nextScreen = rememberScreen(ApplicationNavigation.Home)

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Auth Screen")

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                navigator replace nextScreen
            }
        ) {
            Text("Home")
        }
    }
}
