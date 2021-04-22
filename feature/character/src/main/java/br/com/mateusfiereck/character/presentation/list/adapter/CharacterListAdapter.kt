package br.com.mateusfiereck.character.presentation.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.mateusfiereck.character.databinding.CharacterListItemBinding
import br.com.mateusfiereck.character.domain.model.CharacterModel

class CharacterListAdapter : RecyclerView.Adapter<CharacterListViewHolder>() {

    var characterList = emptyList<CharacterModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int {
        return characterList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterListViewHolder {
        return CharacterListViewHolder(
            CharacterListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CharacterListViewHolder, position: Int) {
        holder.bind(characterList[position])
    }
}
