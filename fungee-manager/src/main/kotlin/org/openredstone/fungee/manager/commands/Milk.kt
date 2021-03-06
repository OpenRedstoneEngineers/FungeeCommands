package org.openredstone.fungee.manager.commands

import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.connection.ProxiedPlayer
import net.md_5.bungee.api.plugin.Command
import org.openredstone.fungee.manager.dispatch
import org.openredstone.fungee.messages.Action

class Milk : Command("milk", "funcommands.milk") {
    override fun execute(
        sender: CommandSender,
        args: Array<String>
    ) {
        val player = sender as? ProxiedPlayer ?: throw Exception("must be run by a player")
        player.dispatch(Action.Milk(player.uniqueId))
    }
}
