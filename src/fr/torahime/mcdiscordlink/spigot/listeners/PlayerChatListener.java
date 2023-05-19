package fr.torahime.mcdiscordlink.spigot.listeners;

import fr.torahime.mcdiscordlink.MinecraftDiscordBridge;
import fr.torahime.mcdiscordlink.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        String playerName = event.getPlayer().getName();
        String message = event.getMessage();

        if(Utils.isBotReady()) MinecraftDiscordBridge.sendMessageToDiscord(playerName, message, false);

    }

}
