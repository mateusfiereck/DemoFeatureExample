package br.com.mateusfiereck.demofeatureexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.mateusfiereck.navigation.HomeNavigation
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val homeNavigation: HomeNavigation by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        homeNavigation.navigateToHome(this)
        finish()
    }
}
