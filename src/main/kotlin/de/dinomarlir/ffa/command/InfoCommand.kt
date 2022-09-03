package de.dinomarlir.ffa.command

import de.dinomarlir.ffa.utils.httpClient
import de.dinomarlir.ffa.utils.scope
import de.dinomarlir.ffa.utils.version
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.launch
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import java.net.URL

class InfoCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        scope.launch {
            val gitVersion = httpClient.get(URL("https://raw.githubusercontent.com/DinoMarlir/ffa/main/.meta/version")).bodyAsText()

            if (version == gitVersion) {
                sender.sendMessage("you are up to date!")
            } else if (gitVersion.contains("404 ")) {
                sender.sendMessage("can't fetch version")
            } else {
                sender.sendMessage("your version is older / newer than the git version!")
            }
        }

        return true
    }
}