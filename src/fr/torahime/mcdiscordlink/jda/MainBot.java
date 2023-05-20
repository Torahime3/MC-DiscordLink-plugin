package fr.torahime.mcdiscordlink.jda;

import fr.torahime.mcdiscordlink.Utils;
import fr.torahime.mcdiscordlink.jda.events.MessageReceivedListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.PermissionOverride;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.PermissionOverrideAction;

import javax.xml.soap.Text;
import java.util.Objects;

public class MainBot {

    private static JDA bot;



    public static void initBot() {

        try{
            MainBot.bot = JDABuilder.createDefault(Utils.getTOKEN())
                    .addEventListeners(new MessageReceivedListener())
                    .enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT)
                    .build();
            System.out.println(Utils.getPLUGIN_PREFIX() + Utils.green() + "Successfully connected to the bot! (" + MainBot.bot.getSelfUser().getAsTag() + ")" + Utils.reset());

            Utils.setBotReady(true);
        } catch (Exception e) {
            System.out.println(Utils.getPLUGIN_PREFIX() + Utils.red() + "Error while connecting to the bot! (" + e.getMessage() + ")" + Utils.reset());

        }

    }

    public static JDA getBot() {
        return bot;
    }


}
