package br.com.mateusfiereck.character.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.mateusfiereck.character.databinding.CharacterListFragmentBinding
import br.com.mateusfiereck.character.presentation.list.adapter.CharacterListAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterListFragment : Fragment() {

    private lateinit var binding: CharacterListFragmentBinding
    private val viewModel: CharacterListViewModel by viewModel()
    private val characterListAdapter: CharacterListAdapter by lazy { CharacterListAdapter() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = CharacterListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupAdapter()
        setupObservers()
    }

    private fun setupAdapter() {
        binding.recyclerCharacters.adapter = characterListAdapter
    }

    private fun setupObservers() {
        viewModel.characterList.observe(viewLifecycleOwner, {
            characterListAdapter.characterList = it
        })
    }
}