package br.com.mateusfiereck.character.data.network.response

data class ApiResponse(
    val info: Info,
    val results: List<CharacterResponse>
) {
    data class Info(
        val count: Int,
        val pages: Int,
        val next: String?,
        val prev: String?
    )
}
