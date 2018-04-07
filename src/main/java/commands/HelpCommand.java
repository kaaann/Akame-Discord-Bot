package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import utils.Changeable;

import java.awt.*;

public class HelpCommand extends ListenerAdapter {


    public void onMessageReceived(final MessageReceivedEvent event) {

        if (event.getAuthor().isBot()) return;

        if (event.getMessage().getContentDisplay().equalsIgnoreCase(Changeable.prefix + "help")) {

            event.getTextChannel().sendMessage(

                    new EmbedBuilder()
                            .setColor(Color.decode("#6699ff"))
                            .setTitle("Commands")
                            .setDescription("Usuage: `" + Changeable.prefix + " <command-name> <arguments>` " +
                                    "\n \nJoin my discord to report bugs and ask questions.\n \n")

                            /**
                             * adding command-fields
                             */
                            .addField(":pen_ballpoint: moderation.", "`→ clear <number>, ping, info`", false)
                            .addField(":headphones: music.", "`→ play, stop, playlist`", false)
                            .addField(":star2: anime.", "`→ anime <name>, animecharacter <name>`", false)
                            .addField(":moneybag: loot.", "`→ daily, money, gamble <number>`", false)

                            .build()

            ).queue(message -> {
                message.addReaction("\uD83D\uDD8A").queue();
                message.addReaction("\uD83C\uDFA7").queue();
                message.addReaction("\uD83C\uDF1F").queue();
                message.addReaction("\uD83D\uDCB0").queue();
            });
        }
    }
}

