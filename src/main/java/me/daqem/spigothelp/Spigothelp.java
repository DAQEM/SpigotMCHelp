package me.daqem.spigothelp;

import me.daqem.spigothelp.AloPace.AloInventory;
import me.daqem.spigothelp.CatGuy.SmeltListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spigothelp extends JavaPlugin {

    @Override
    public void onEnable() {
        loadCommands();
        loadEvents();
    }

    @Override
    public void onDisable() {

    }

    public void loadCommands() {

    }

    public void loadEvents() {
        getServer().getPluginManager().registerEvents(new SmeltListener(), this);
        getServer().getPluginManager().registerEvents(new AloInventory(), this);
    }
}
