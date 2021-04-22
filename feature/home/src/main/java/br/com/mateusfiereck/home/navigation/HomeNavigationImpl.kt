package br.com.mateusfiereck.home.navigation

import android.content.Context
import android.content.Intent
import br.com.mateusfiereck.home.HomeActivity
import br.com.mateusfiereck.navigation.HomeNavigation

class HomeNavigationImpl : HomeNavigation {

    override fun navigateToHome(context: Context) {
        context.startActivity(Intent(context, HomeActivity::class.java))
    }
}