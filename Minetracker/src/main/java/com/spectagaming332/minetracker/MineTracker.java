package com.ivan.minetracker;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class MineTracker extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("MineTracker enabled!"); //prints Minetracker Enabled
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Logging"); //Prints "Logging"
    }

    @Override
    public void onDisable() {
        getLogger().info("MineTracker disabled!");
        getLogger().info("Logging");
    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Material[] blocksToAnnounce = {Material.DIAMOND_ORE, Material.EMERALD_ORE}; // add more blocks as needed

        Material blockType = event.getBlock().getType();
        if (Arrays.asList(blocksToAnnounce).contains(blockType)) {
            String playerName = event.getPlayer().getName();
            String blockName = blockType.toString().toUpperCase().replace("_", " ");
            getServer().broadcastMessage(ChatColor.GREEN + playerName + " mined " + ChatColor.GOLD + blockName + "!");
            getServer().getMessenger();
            getLogger().info("Remember this server keeps logs... Logging");
        }

    }
}
