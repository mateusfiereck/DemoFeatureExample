package br.com.mateusfiereck.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.mateusfiereck.home.databinding.HomeActivityBinding
import br.com.mateusfiereck.navigation.CharacterNavigation
import br.com.mateusfiereck.navigation.EpisodeNavigation
import org.koin.android.ext.android.inject

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: HomeActivityBinding

    private val characterNavigation: CharacterNavigation by inject()
    private val episodeNavigation: EpisodeNavigation by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        binding.buttonCharacter.setOnClickListener {
            characterNavigation.navigateToCharacter(this)
        }

        binding.buttonEpisode.setOnClickListener {
            episodeNavigation.navigateToEpisode(this)
        }
    }
}
