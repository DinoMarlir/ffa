package de.dinomarlir.ffa.listener

import de.dinomarlir.ffa.player.FFAPlayer
import de.dinomarlir.ffa.player.ffaPlayers
import net.axay.kspigot.event.listen
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

object ConnectionListener {

    init {
        listen<PlayerJoinEvent> {
            val player = it.player

            if (ffaPlayers.containsKey(player.uniqueId)) ffaPlayers.remove(player.uniqueId)
            if (!ffaPlayers.containsKey(player.uniqueId)) ffaPlayers[player.uniqueId] = FFAPlayer(player.uniqueId)

            it.joinMessage = ""
        }

        listen<PlayerQuitEvent> {
            val player = it.player

            if (ffaPlayers.containsKey(player.uniqueId)) ffaPlayers.remove(player.uniqueId)
            it.quitMessage = ""
        }
    }
}