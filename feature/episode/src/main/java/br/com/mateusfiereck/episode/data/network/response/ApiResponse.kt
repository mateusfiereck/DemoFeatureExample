package br.com.mateusfiereck.episode.data.network.response

data class ApiResponse(
    val info: Info,
    val results: List<EpisodeResponse>
) {
    data class Info(
        val count: Int,
        val pages: Int,
        val next: String?,
        val prev: String?
    )
}
