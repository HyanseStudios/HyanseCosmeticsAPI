package com.ziwoxyt.hyansecosmetics;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HyanseCosmetics extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("This is an API, You need to purchase the Plugin in order to use it!");
        Bukkit.getPluginManager().disablePlugin(this);
    }

}
