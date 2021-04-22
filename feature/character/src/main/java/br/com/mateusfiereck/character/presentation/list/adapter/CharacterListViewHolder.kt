package br.com.mateusfiereck.character.presentation.list.adapter

import androidx.recyclerview.widget.RecyclerView
import br.com.mateusfiereck.character.databinding.CharacterListItemBinding
import br.com.mateusfiereck.character.domain.model.CharacterModel

class CharacterListViewHolder(
    private val binding: CharacterListItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(characterModel: CharacterModel) {
        binding.textName.text = characterModel.name
        binding.textSpecies.text = characterModel.species
    }
}