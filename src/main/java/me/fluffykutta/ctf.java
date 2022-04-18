package me.fluffykutta;

import org.bukkit.plugin.java.JavaPlugin;

import me.fluffykutta.Listeners.BarrierBlockBreak;

public final class ctf extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new BarrierBlockBreak(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
