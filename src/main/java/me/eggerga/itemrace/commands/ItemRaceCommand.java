package me.eggerga.itemrace.commands;

import me.eggerga.itemrace.Game;
import me.eggerga.itemrace.ItemRace;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class ItemRaceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(Bukkit.getOnlinePlayers().size() < 2) {
                player.sendMessage(ChatColor.RED + "There must be 2 online players to start the game!");
                return false;
            }

            if(args.length > 0) {
                if(args[0].equalsIgnoreCase("start")) {
                    // send players instructions
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Welcome to ItemRace!");
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "Players will be tasked with obtaining certain items");
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "Failing to obtain such item will result in a strike, two strikes and you lose!");

                    // set active game
                    List<Player> onlinePlayers = new ArrayList<Player>(Bukkit.getOnlinePlayers());
                    Player player1 = onlinePlayers.get(0);
                    Player player2 = onlinePlayers.get(0);

                    ItemRace.setActiveGame(new Game(player1, player2, 2 ,2));
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
