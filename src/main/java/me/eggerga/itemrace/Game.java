package me.eggerga.itemrace;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class Game {
    private final Player player1;
    private final Player player2;

    private int player1Strikes;
    private int player2Strikes;

    private final List<Material> possibleItems = Arrays.asList(Material.DIAMOND, Material.DIRT, Material.COBBLESTONE, Material.COBBLED_DEEPSLATE, Material.OBSIDIAN, Material.OAK_WOOD, Material.RED_DYE, Material.SHIELD, Material.REDSTONE, Material.WHITE_BED, Material.RED_WOOL, Material.COOKED_CHICKEN, Material.COD_BUCKET, Material.MAGMA_BLOCK, Material.FLINT_AND_STEEL, Material.GOLD_INGOT);

    public Game(Player player1, Player player2, int player1Strikes, int player2Strikes) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1Strikes = player1Strikes;
        this.player2Strikes = player2Strikes;
    }
}
