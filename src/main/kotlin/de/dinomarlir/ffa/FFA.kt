package de.dinomarlir.ffa

import de.dinomarlir.ffa.logging.Logger
import net.axay.kspigot.main.KSpigot

class FFA : KSpigot() {

    val logger = Logger()

    override fun load() {
    }

    override fun startup() {
        logger.success("plugin loaded!")
    }

    override fun shutdown() {
    }
}
