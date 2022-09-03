package de.dinomarlir.ffa.utils

import io.ktor.client.request.*
import io.ktor.client.statement.*

class GitUpdateChecker {

    val branch = "main" //the branch of the repository
    val repository = "ffa"
    val githubName = "DinoMarlir" //the GitHub user
    val gitLink = "https://raw.githubusercontent.com/$githubName/$repository/$branch/.meta/version"

    suspend fun getLatestVersion(): String {
        return httpClient.get(gitLink).bodyAsText()
    }
}