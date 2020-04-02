package com.altoya.playerdata;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new PlayerData(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
