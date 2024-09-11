package de.simpmc.siMPHoneyBlocks;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;



public class BeeMode implements Listener {
    @EventHandler
    public void onPlayerDrinkHoney(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (event.getItem().getType() != Material.HONEY_BOTTLE) {
            player.addPotionEffect(new PotionEffect( PotionEffectType.LEVITATION, 25 * 20,1));
            player.addPotionEffect( new PotionEffect( PotionEffectType.SPEED, 25 * 20,1));
            player.sendMessage("Du bist für 25sek eine Biene!");
            if (player.isOnGround()) {
                player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation(), 10, 0.5, 0.5, 0.5, 0.01);
            }
            new BukkitRunnable() {
                @Override
                public void run() {
                    player.removePotionEffect(PotionEffectType.SPEED);
                    player.removePotionEffect(PotionEffectType.LEVITATION);
                    player.sendMessage("das wars!");


                }

            }.runTaskLater((Plugin) this, 25 * 20);
        }
    }
}
