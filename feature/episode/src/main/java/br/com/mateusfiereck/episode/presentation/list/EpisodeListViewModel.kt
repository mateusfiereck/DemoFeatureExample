package br.com.mateusfiereck.episode.presentation.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.mateusfiereck.episode.domain.model.EpisodeModel
import br.com.mateusfiereck.episode.domain.repository.EpisodeRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class EpisodeListViewModel(
    private val episodeRepository: EpisodeRepository
) : ViewModel() {

    private val _episodeList = MutableLiveData<List<EpisodeModel>>()
    val episodeList: LiveData<List<EpisodeModel>>
        get() = _episodeList

    init {
        getEpisodes()
    }

    private fun getEpisodes() {
        episodeRepository.getEpisodes()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _episodeList.postValue(it)
            }, {
                Log.d("Debug", "getEpisodes: ${it.message}")
            })
    }
}