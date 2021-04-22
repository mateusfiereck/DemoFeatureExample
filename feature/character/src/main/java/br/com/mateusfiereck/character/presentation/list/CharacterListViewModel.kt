package br.com.mateusfiereck.character.presentation.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.mateusfiereck.character.domain.model.CharacterModel
import br.com.mateusfiereck.character.domain.repository.CharacterRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class CharacterListViewModel(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    private val _characterList = MutableLiveData<List<CharacterModel>>()
    val characterList: LiveData<List<CharacterModel>>
        get() = _characterList

    init {
        getCharacters()
    }

    private fun getCharacters() {
        characterRepository.getCharacters()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _characterList.postValue(it)
            }, {
                Log.d("Debug", "getCharacters: ${it.message}")
            })
    }
}