package de.dinomarlir.ffa

import de.dinomarlir.ffa.config.MongoConfig
import de.dinomarlir.ffa.listener.ConnectionListener
import de.dinomarlir.ffa.logging.Logger
import net.axay.kspigot.main.KSpigot

class FFA : KSpigot() {

    override fun load() {
    }

    override fun startup() {
        de.dinomarlir.ffa.utils.logger.success("loaded")
        ConnectionListener
    }

    override fun shutdown() {
    }
}
