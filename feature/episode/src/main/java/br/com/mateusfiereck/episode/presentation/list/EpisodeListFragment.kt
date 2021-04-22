package br.com.mateusfiereck.episode.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.mateusfiereck.episode.R
import br.com.mateusfiereck.episode.databinding.EpisodeListFragmentBinding
import br.com.mateusfiereck.episode.presentation.list.adapter.EpisodeListAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class EpisodeListFragment : Fragment(R.layout.episode_list_fragment) {

    private lateinit var binding: EpisodeListFragmentBinding
    private val viewModel: EpisodeListViewModel by viewModel()
    private val episodeListAdapter: EpisodeListAdapter by lazy { EpisodeListAdapter() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = EpisodeListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupAdapter()
        setupObservers()
    }

    private fun setupAdapter() {
        binding.recyclerEpisodes.adapter = episodeListAdapter
    }

    private fun setupObservers() {
        viewModel.episodeList.observe(viewLifecycleOwner, {
            episodeListAdapter.episodeList = it
        })
    }
}
