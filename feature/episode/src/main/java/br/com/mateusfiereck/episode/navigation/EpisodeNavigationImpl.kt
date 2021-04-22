package br.com.mateusfiereck.episode.navigation

import android.content.Context
import android.content.Intent
import br.com.mateusfiereck.episode.presentation.EpisodeActivity
import br.com.mateusfiereck.navigation.EpisodeNavigation

class EpisodeNavigationImpl : EpisodeNavigation {

    override fun navigateToEpisode(context: Context) {
        context.startActivity(Intent(context, EpisodeActivity::class.java))
    }
}
