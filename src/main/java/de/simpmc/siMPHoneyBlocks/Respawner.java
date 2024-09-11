package de.simpmc.siMPHoneyBlocks;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Respawner implements Listener, RespawnerSiMP {


    @Override
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();

        new BukkitRunnable() {
            @Override
            public void run() {
                block.setType(Material.HONEY_BLOCK);
            }
        }.runTaskLater((Plugin) this, 100);

    }
}
