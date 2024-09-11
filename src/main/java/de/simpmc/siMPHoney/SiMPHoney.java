package de.simpmc.siMPHoney;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class SiMPHoney extends JavaPlugin {
    private boolean enabled;

    @Override
    public void onEnable() {
        this.enabled = this.getConfig().getBoolean("enabled", true);
        this.saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new HoneyListener(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

