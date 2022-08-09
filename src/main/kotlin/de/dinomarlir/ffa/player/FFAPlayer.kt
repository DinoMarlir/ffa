package de.dinomarlir.ffa.player

import java.util.UUID

data class FFAPlayer(val uuid: UUID, var isIngame: Boolean) {
}

var ffaPlayers = HashMap<UUID, FFAPlayer>()