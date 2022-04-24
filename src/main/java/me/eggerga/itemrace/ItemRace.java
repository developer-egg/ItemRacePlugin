package me.eggerga.itemrace;

import org.bukkit.plugin.java.JavaPlugin;

public final class ItemRace extends JavaPlugin {
    private static ItemRace plugin;
    private static Game activeGame;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin ready!");
    }

    public static ItemRace getPlugin() {
        return plugin;
    }

    public static void setPlugin(ItemRace plugin) {
        ItemRace.plugin = plugin;
    }

    public static Game getActiveGame() {
        return activeGame;
    }

    public static void setActiveGame(Game activeGame) {
        ItemRace.activeGame = activeGame;
    }
}
