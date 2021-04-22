package br.com.mateusfiereck.demofeatureexample

import android.app.Application
import br.com.mateusfiereck.character.di.characterModule
import br.com.mateusfiereck.episode.di.episodeModule
import br.com.mateusfiereck.home.di.homeModule
import br.com.mateusfiereck.network.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CustomApp : Application() {

    override fun onCreate() {
        super.onCreate()

        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidLogger()
            androidContext(this@CustomApp)
            modules(characterModule, episodeModule, homeModule, networkModule)
        }
    }
}
