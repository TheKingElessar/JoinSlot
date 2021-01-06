package com.thekingelessar.joinslot;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class JoinSlot extends JavaPlugin
{
    
    static public FileConfiguration config = null;
    static public int selectedSlot = -1;
    
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new JoinEventListener(), this);
        this.saveDefaultConfig();
        config = this.getConfig();
        
        selectedSlot = config.getInt("slot_selected");
        
        super.onEnable();
    }
    
    @Override
    public void onDisable()
    {
        super.onDisable();
    }
    
}