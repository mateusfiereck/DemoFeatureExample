package br.com.mateusfiereck.democharacter

import android.app.Application
import br.com.mateusfiereck.character.di.characterModule
import br.com.mateusfiereck.network.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DemoCharacterApp : Application() {

    override fun onCreate() {
        super.onCreate()

        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidLogger()
            androidContext(this@DemoCharacterApp)
            modules(characterModule, networkModule)
        }
    }
}
