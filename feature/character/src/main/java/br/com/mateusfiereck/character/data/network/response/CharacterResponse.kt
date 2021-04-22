package br.com.mateusfiereck.character.data.network.response

data class CharacterResponse(
    val id: Int,
    val name: String,
    val status: String,
    val species: String
)
