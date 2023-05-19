package fr.torahime.mcdiscordlink;

import org.bukkit.ChatColor;
import org.bukkit.Color;

public class Utils {


    //ANSI COLOR CODES
    private static final String reset = "\u001B[0m";

    private static final String red = "\u001B[31m";

    private static final String green = "\u001B[32m";

    private static final String yellow = "\u001B[33m";

    ////////////////////

    private static final String PLUGIN_PREFIX = yellow + "[MC-DiscordLink] " + reset;

    private static String DISCORD_PREFIX = "§9[DISCORD]§f ";

    private static String TOKEN = "";

    private static String CHANNEL_ID = "710668664644644648";

    private static boolean botReady = false;


    public static String reset() {
        return reset;
    }

    public static String red() {
        return red;
    }

    public static String green() {
        return green;
    }


    public static boolean isBotReady() {
        return botReady;
    }

    public static String getPREFIX() {
        return DISCORD_PREFIX;
    }

    public static String getTOKEN() {
        return TOKEN;
    }

    public static String getCHANNEL_ID() {
        return CHANNEL_ID;
    }

    public static String getPLUGIN_PREFIX() {
        return PLUGIN_PREFIX;
    }

    public static void setCHANNEL_ID(String channelID) {
        CHANNEL_ID = channelID;
    }

    public static void setTOKEN(String discordBotToken) {
        TOKEN = discordBotToken;
    }

    public static void setDISCORD_PREFIX(String discordPrefix) {
        DISCORD_PREFIX = ChatColor.translateAlternateColorCodes('§', discordPrefix);
    }

    public static void setBotReady(boolean ready) {
        botReady = ready;
    }
}
