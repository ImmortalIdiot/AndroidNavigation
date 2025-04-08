import cafe.adriel.voyager.core.registry.screenModule

val mainScreenModule = screenModule {
    register<ApplicationNavigation.Main> { MainScreen() }
}
