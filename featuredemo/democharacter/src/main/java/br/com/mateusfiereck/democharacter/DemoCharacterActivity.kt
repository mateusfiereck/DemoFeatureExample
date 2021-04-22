package br.com.mateusfiereck.democharacter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.mateusfiereck.character.presentation.CharacterActivity

class DemoCharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.demo_character_activity)

        startActivity(Intent(this, CharacterActivity::class.java))
        finish()
    }
}