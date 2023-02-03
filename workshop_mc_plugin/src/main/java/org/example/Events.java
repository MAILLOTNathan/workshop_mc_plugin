package org.example;

import org.bukkit.ChatColor;
import org.bukkit.conversations.PlayerNamePrompt;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage("guidon supreme oui");
    }
}
