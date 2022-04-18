package me.fluffykutta.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BarrierBlockBreak implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getBlock().getType().equals(Material.BARRIER)) {
            event.setCancelled(true);
            return;
        }
    }
}
