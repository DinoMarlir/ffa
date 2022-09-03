package de.dinomarlir.ffa.config

import de.dinomarlir.ffa.utils.json
import de.dinomarlir.ffa.utils.logger
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import java.io.File

@Serializable
data class Config(val prefix: String)

object ConfigurationFile {
    val file = File("plugins/ffa/config.json")
    var config: Config? = null

    fun updateFile() {
        if(!file.parentFile.exists()) {
            file.parentFile.mkdirs()
        }
        if(!file.exists()) {
            file.createNewFile()
            file.writeText(json.encodeToString(Config("PREFIX | ")))
        }
        kotlin.runCatching {
            config = json.decodeFromString(file.readText())
            println(config?.prefix)
        }
    }
}