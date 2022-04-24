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

    private Material player1CurrentItem;
    private Material player2CurrentItem;

    private boolean hasPlayer1ObtainedItem;
    private boolean hasPlayer2ObtainedItem;

    private final List<Material> possibleItems = Arrays.asList(Material.DIAMOND, Material.DIRT, Material.COBBLESTONE, Material.COBBLED_DEEPSLATE, Material.OBSIDIAN, Material.OAK_WOOD, Material.RED_DYE, Material.SHIELD, Material.REDSTONE, Material.WHITE_BED, Material.RED_WOOL, Material.COOKED_CHICKEN, Material.COD_BUCKET, Material.MAGMA_BLOCK, Material.FLINT_AND_STEEL, Material.GOLD_INGOT);

    public Game(Player player1, Player player2, int player1Strikes, int player2Strikes) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1Strikes = player1Strikes;
        this.player2Strikes = player2Strikes;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getPlayer1Strikes() {
        return player1Strikes;
    }

    public void setPlayer1Strikes(int player1Strikes) {
        this.player1Strikes = player1Strikes;
    }

    public int getPlayer2Strikes() {
        return player2Strikes;
    }

    public void setPlayer2Strikes(int player2Strikes) {
        this.player2Strikes = player2Strikes;
    }

    public Material getPlayer1CurrentItem() {
        return player1CurrentItem;
    }

    public void setPlayer1CurrentItem(Material player1CurrentItem) {
        this.player1CurrentItem = player1CurrentItem;
    }

    public Material getPlayer2CurrentItem() {
        return player2CurrentItem;
    }

    public void setPlayer2CurrentItem(Material player2CurrentItem) {
        this.player2CurrentItem = player2CurrentItem;
    }

    public boolean isHasPlayer1ObtainedItem() {
        return hasPlayer1ObtainedItem;
    }

    public void setHasPlayer1ObtainedItem(boolean hasPlayer1ObtainedItem) {
        this.hasPlayer1ObtainedItem = hasPlayer1ObtainedItem;
    }

    public boolean isHasPlayer2ObtainedItem() {
        return hasPlayer2ObtainedItem;
    }

    public void setHasPlayer2ObtainedItem(boolean hasPlayer2ObtainedItem) {
        this.hasPlayer2ObtainedItem = hasPlayer2ObtainedItem;
    }

    public List<Material> getPossibleItems() {
        return possibleItems;
    }
}
