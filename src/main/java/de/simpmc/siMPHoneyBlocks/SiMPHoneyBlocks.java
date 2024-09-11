package de.simpmc.siMPHoneyBlocks;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class SiMPHoneyBlocks extends JavaPlugin {
    private boolean enabled;


@Override
    public void onEnable() {
        this.enabled = this.getConfig().getBoolean("enable", true);
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new HoneyListener(),this);
        Bukkit.getLogger().info("HoneyBlocks Plugin wurde aktiviert!");
        saveDefaultConfig();
        reloadConfig();
        getServer().getPluginManager().registerEvents((Listener) this, this);
        // Plugin startup logic


    }

    @Override
    public void onDisable() {
    Bukkit.getLogger().info("HoneyBlocks Plugin wurde beendet!");
        // Plugin shutdown logic
    }
    private void loadConfig() {
    FileConfiguration config = this.getConfig();
    String BlockType = config.getString("BlockType", "HONEY_BLOCK");

    }

}
