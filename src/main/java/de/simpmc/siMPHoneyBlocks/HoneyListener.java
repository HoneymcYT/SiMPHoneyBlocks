package de.simpmc.siMPHoneyBlocks;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class HoneyListener implements Listener {
    @EventHandler
    public void onHoney(BlockBreakEvent event) {
        if(event.getBlock().getBlockData().getMaterial() != Material.HONEY_BLOCK){
            return;
        }
        event.getBlock().getDrops().clear();
        ItemStack is = new ItemStack(Material.HONEY_BOTTLE);


        event.getBlock().getDrops().add(is);
        }
}
