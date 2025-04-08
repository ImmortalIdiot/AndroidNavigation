import cafe.adriel.voyager.core.registry.screenModule

val authScreenModule = screenModule {
    register<ApplicationNavigation.Auth> { AuthScreen() }
}
