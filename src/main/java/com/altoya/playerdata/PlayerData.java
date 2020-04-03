package com.altoya.playerdata;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.File;
import java.io.IOException;

public class PlayerData implements Listener {
    @EventHandler
    public void playerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String playerName = player.getName();

        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("PlayerData").getDataFolder() , File.separator + "PlayerDatabase");
        File file = new File(userdata, File.separator + playerName + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);

        if(!file.exists()){
            try{
                playerData.createSection("stats");
                playerData.set("stats.totalLogins", 1);

                playerData.createSection("faction");
                playerData.set("faction.hasFaction", false);
                playerData.set("faction.isLeader", false);
                playerData.set("faction.power", 1);


                playerData.save(file);

            } catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}