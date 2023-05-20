# MC-DiscordLink

MC-DiscordLink is a Minecraft plugin that seamlessly bridges your game server and your Discord server. It allows players to communicate instantly with a dedicated Discord channel directly from the Minecraft chat and vice versa. With easy setup and integration, this versatile extension can be used with your existing Discord bots.

## Installation

Download the .jar and drag it into your plugins folder. Launch the server to initialize it.
Close the server and fill in the following fields in the config.yml file: 

```yml
# MC-DiscordLink configuration file
DiscordBotToken: ''
ChannelID: ''
DiscordPrefix: "\xa79[DISCORD]\xa7f"
```

● To get the token of your discord bot, go to the [Discord Developer Portal](https://discord.com/developers/applications)
, choose the application of your bot, in the categories on the left choose "Bot" and copy/paste the token in the config.yml

● To get the Channel ID in which you want the discord bot to send messages, right click on the text channel, and copy the channel ID

● The discord prefix represents the prefix that will be sent in the minecraft chat when a player talks from the discord channel. To change the color of the prefix, just put the character of the minecraft color before "\xa7".
For example, the dark red has the color code §4. Then you should write \xa74. 

Restart the server, and if everything was well configured, the bot should turn online and these messages should appear in the console 

```yml
[MC-DiscordLink] Successfully connected to the bot! (<bot-name>#<tag-number>)
[MC-DiscordLink] MC-DiscordLink has been enabled!
```

Now all you have to do is chat!

## Contributing

If you want to contribute to the project, make sure you are using the following libraries:

```yml
spigot: "1.8.8"
JDA: "5.0.0" 
```

## License

[MIT](https://choosealicense.com/licenses/mit/)
