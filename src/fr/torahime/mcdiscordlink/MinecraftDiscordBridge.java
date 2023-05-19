package fr.torahime.mcdiscordlink;

import fr.torahime.mcdiscordlink.jda.MainBot;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import org.bukkit.Bukkit;

public class MinecraftDiscordBridge {

    public static void sendMessageToDiscord(String author, String messageContent, boolean fromDiscord) {

        if(messageContent == null) return;

        String message = "";
        if(fromDiscord) {
            message = "[DISCORD] ";
        }
        message = message + author + " : " + messageContent;

        TextChannel channel = MainBot.getBot().getTextChannelById(Utils.getCHANNEL_ID());
        channel.sendMessage(message).queue();

    }

    public static void sendMessageToMinecraft(String author, String messageContent) {
        sendMessageToDiscord(author, messageContent, true);

        if(messageContent == null) return;

        String message = Utils.getPREFIX() + author + " : " + messageContent;

        Bukkit.broadcastMessage(message);

    }

}
