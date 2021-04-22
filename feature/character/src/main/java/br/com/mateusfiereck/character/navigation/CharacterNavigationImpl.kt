package br.com.mateusfiereck.character.navigation

import android.content.Context
import android.content.Intent
import br.com.mateusfiereck.character.presentation.CharacterActivity
import br.com.mateusfiereck.navigation.CharacterNavigation

class CharacterNavigationImpl : CharacterNavigation {

    override fun navigateToCharacter(context: Context) {
        context.startActivity(Intent(context, CharacterActivity::class.java))
    }
}