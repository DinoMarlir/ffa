package de.dinomarlir.ffa.logging

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.chat.literalText
import net.kyori.adventure.text.Component
import org.bukkit.Bukkit

class Logger() {
    fun warning(message: String) {
        Bukkit.getConsoleSender().sendMessage(literalText(message) {
            color = KColors.YELLOW
        })
    }

    fun error(message: String) {
        Bukkit.getConsoleSender().sendMessage(literalText(message) {
            color = KColors.RED
        })
    }

    fun println(message: String) {
        System.out.println(message)
    }

    fun success(message: String) {
        Bukkit.getConsoleSender().sendMessage(literalText(message) {
            color = KColors.GREEN
        })
    }

    fun sendMessage(message: String) {
        Bukkit.getConsoleSender().sendMessage(message)
    }

    fun sendMessage(message: Component) {
        Bukkit.getConsoleSender().sendMessage(message)
    }
}