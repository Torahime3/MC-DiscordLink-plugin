package fr.torahime.mcdiscordlink.jda.events;

import fr.torahime.mcdiscordlink.MinecraftDiscordBridge;
import fr.torahime.mcdiscordlink.Utils;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReceivedListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        if (event.getAuthor().isBot()) return;

        if (!event.getChannel().getId().equals(Utils.getCHANNEL_ID())) return;

        MinecraftDiscordBridge.sendMessageToMinecraft(event.getAuthor().getName(), event.getMessage().getContentRaw());

        event.getMessage().delete().queue();

    }

}
