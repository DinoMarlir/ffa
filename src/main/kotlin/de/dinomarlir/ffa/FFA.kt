package de.dinomarlir.ffa

import de.dinomarlir.ffa.command.SetupCommand
import de.dinomarlir.ffa.listener.ConnectionListener
import de.dinomarlir.ffa.logging.Logger
import net.axay.kspigot.main.KSpigot

object FFA : KSpigot() {
    val mainLogger = Logger()

    override fun load() {
    }

    override fun startup() {
        mainLogger.success("loaded")
        ConnectionListener

        SetupCommand.command
    }

    override fun shutdown() {
    }
}
