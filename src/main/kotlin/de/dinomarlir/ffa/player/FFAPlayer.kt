package de.dinomarlir.ffa.player

import java.util.UUID

data class FFAPlayer(val uuid: UUID) {
}

var ffaPlayers = HashMap<UUID, FFAPlayer>()