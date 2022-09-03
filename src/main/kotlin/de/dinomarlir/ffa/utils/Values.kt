package de.dinomarlir.ffa.utils

import de.dinomarlir.ffa.config.ConfigurationFile
import de.dinomarlir.ffa.logging.Logger
import io.ktor.client.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

val logger = Logger()

//https://github.com/mooziii/arachnophobia-mode-for-minecraft/blob/db237bc999a464f70e6c4507d1630e654349dc37/src/main/kotlin/me/obsilabor/arachnophobiamodeforminecraft/ArachnophobiaMode.kt#L15
@OptIn(ExperimentalSerializationApi::class)
val json = Json {
    prettyPrint = true
    encodeDefaults = true
    @Suppress("EXPERIMENTAL_API_USAGE")
    prettyPrintIndent = "  "
}

var prefix = ConfigurationFile.config?.prefix?.replace("&", "§")
val httpClient = HttpClient {

}

val scope = CoroutineScope(Dispatchers.IO)

val version = "DEV-0.0.1"