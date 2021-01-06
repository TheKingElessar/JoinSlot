package com.thekingelessar.joinslot;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import static com.thekingelessar.joinslot.JoinSlot.selectedSlot;

public class JoinEventListener implements Listener
{
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent joinEvent)
    {
        if (!(selectedSlot < 0) && selectedSlot <= 8)
        {
            joinEvent.getPlayer().getInventory().setHeldItemSlot(selectedSlot);
        }
    }
}
