package de.dinomarlir.ffa.command

import com.mojang.brigadier.arguments.BoolArgumentType
import com.mojang.brigadier.arguments.StringArgumentType
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.commands.argument
import net.axay.kspigot.commands.command
import net.axay.kspigot.commands.literal
import net.axay.kspigot.commands.runs
import net.kyori.adventure.text.Component

object SetupCommand {
    val command = command("setup") {
        runs {
            player.sendMessage("This is a text!")
        }
        argument("world", StringArgumentType.string()) runs  {
            player.sendMessage(Component.text("This is a test!").color(KColors.LIMEGREEN))
        }
    }
}