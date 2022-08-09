package de.dinomarlir.ffa.map

import kotlinx.serialization.Serializable
import javax.xml.stream.Location

@Serializable
data class Map(
    val displayName: String,
    val worldName: String,
    val description: String,
    val builder: List<String>,
    val spawnLocation: Location,
    val borderPos1: Location,
    val borderPos2: Location
) {
}