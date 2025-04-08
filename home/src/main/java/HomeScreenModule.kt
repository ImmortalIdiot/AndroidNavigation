import cafe.adriel.voyager.core.registry.screenModule

val homeScreenModule = screenModule {
    register<ApplicationNavigation.Home> { HomeScreen() }
}
