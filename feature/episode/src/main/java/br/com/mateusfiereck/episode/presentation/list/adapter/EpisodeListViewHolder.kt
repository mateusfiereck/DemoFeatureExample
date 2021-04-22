package br.com.mateusfiereck.episode.presentation.list.adapter

import androidx.recyclerview.widget.RecyclerView
import br.com.mateusfiereck.episode.databinding.EpisodeListItemBinding
import br.com.mateusfiereck.episode.domain.model.EpisodeModel

class EpisodeListViewHolder(
    private val binding: EpisodeListItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(episodeModel: EpisodeModel) {
        binding.textName.text = episodeModel.name
        binding.textEpisode.text = episodeModel.episode
    }
}
