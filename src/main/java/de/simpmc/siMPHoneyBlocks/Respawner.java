package de.simpmc.siMPHoneyBlocks;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class Respawner implements Listener {


    @Override
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();

        new BukkitRunnable() {
            @Override
            public void run() {
                block.setType(Material.HONEY_BLOCK);
            }
        }.runTaskLater(this, 100);

    }
}
