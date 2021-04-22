package br.com.mateusfiereck.episode.presentation

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.com.mateusfiereck.episode.R

class EpisodeActivity : AppCompatActivity(R.layout.episode_activity) {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d("Mateus", "onCreate: EpisodeActivity")
    }
}
