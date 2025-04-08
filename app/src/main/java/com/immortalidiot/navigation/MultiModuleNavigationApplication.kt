package com.immortalidiot.navigation

import android.app.Application
import authScreenModule
import cafe.adriel.voyager.core.registry.ScreenRegistry
import homeScreenModule
import mainScreenModule

class MultiModuleNavigationApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ScreenRegistry {
            authScreenModule()
            homeScreenModule()
            mainScreenModule()
        }
    }
}
