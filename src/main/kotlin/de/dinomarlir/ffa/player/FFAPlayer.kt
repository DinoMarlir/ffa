package de.dinomarlir.ffa.player

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.chat.literalText
import org.bukkit.Bukkit
import java.util.UUID

data class FFAPlayer(val uuid: UUID, var isIngame: Boolean) {
    fun sendWarningMessage(message: String) {
        Bukkit.getPlayer(uuid)?.sendMessage(literalText(message) {
            color = KColors.YELLOW
        })
    }

    fun sendSuccessMessage(message: String) {
        Bukkit.getPlayer(uuid)?.sendMessage(literalText(message) {
            color = KColors.GREEN
        })
    }

    fun sendErrorMessage(message: String) {
        Bukkit.getPlayer(uuid)?.sendMessage(literalText(message) {
            color = KColors.RED
        })
    }
}

var ffaPlayers = HashMap<UUID, FFAPlayer>()