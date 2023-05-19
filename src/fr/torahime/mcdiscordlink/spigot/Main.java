package fr.torahime.mcdiscordlink.spigot;

import fr.torahime.mcdiscordlink.Utils;
import fr.torahime.mcdiscordlink.jda.MainBot;
import fr.torahime.mcdiscordlink.spigot.listeners.PlayerChatListener;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        createConfig();
        registerEvents();

        if(loadConfig()){
            MainBot.initBot();
            System.out.println(Utils.getPLUGIN_PREFIX() + Utils.green() + "MC-DiscordLink has been enabled!" + Utils.reset());
        } else {
            System.out.println(Utils.getPLUGIN_PREFIX() + Utils.red() + "Plugin can't start without a valid config.yml" + Utils.reset());
        }

    }

    @Override
    public void onDisable() {
        System.out.println(Utils.getPLUGIN_PREFIX() + Utils.green() + "MC-DiscordLink has been disabled!" + Utils.reset());
    }

    public void registerEvents(){

        getServer().getPluginManager().registerEvents(new PlayerChatListener(), this);

    }

    private boolean loadConfig() {

        boolean launchable = true;

        if(config.getString("DiscordBotToken").isEmpty()){
            System.out.println(Utils.getPLUGIN_PREFIX() + Utils.red() + "DiscordBotToken is empty! Please fill it in the config.yml" + Utils.reset());
            launchable = false;
        } else {
            Utils.setTOKEN(config.getString("DiscordBotToken"));
        }

        if(config.getString("ChannelID").isEmpty()){
            System.out.println(Utils.getPLUGIN_PREFIX() + Utils.red() + "ChannelID is empty! Please fill it in the config.yml" + Utils.reset());
            launchable = false;
        } else {
            Utils.setCHANNEL_ID(config.getString("ChannelID"));
        }

        if(config.getString("DiscordPrefix").isEmpty()){
            System.out.println(Utils.getPLUGIN_PREFIX() + Utils.red() + "DiscordPrefix is empty! Please fill it in the config.yml" + Utils.reset());
            launchable = false;
        } else {
            Utils.setDISCORD_PREFIX(config.getString("DiscordPrefix"));
        }

        return launchable;
    }



    public void createConfig() {

        config.options().header("MC-DiscordLink configuration file");

        config.addDefault("DiscordBotToken", "");
        config.addDefault("ChannelID", "");
        config.addDefault("DiscordPrefix", "§9[DISCORD]§f");

        config.options().copyDefaults(true);
        saveConfig();



    }
}