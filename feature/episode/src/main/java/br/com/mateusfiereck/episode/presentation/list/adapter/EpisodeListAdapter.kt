package br.com.mateusfiereck.episode.presentation.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.mateusfiereck.episode.databinding.EpisodeListItemBinding
import br.com.mateusfiereck.episode.domain.model.EpisodeModel

class EpisodeListAdapter : RecyclerView.Adapter<EpisodeListViewHolder>() {

    var episodeList = emptyList<EpisodeModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int {
        return episodeList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeListViewHolder {
        return EpisodeListViewHolder(
            EpisodeListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: EpisodeListViewHolder, position: Int) {
        holder.bind(episodeList[position])
    }
}