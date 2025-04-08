import cafe.adriel.voyager.core.registry.ScreenProvider

sealed class ApplicationNavigation : ScreenProvider {
    data object Auth : ApplicationNavigation()
    data object Home : ApplicationNavigation()
    data object Main : ApplicationNavigation()
}
