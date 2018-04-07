package listener;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


/**
 * Created by Kaan on 10.03.2018.
 */
public class MessageReceivedListener extends ListenerAdapter{

    public void onMessageReceived(final MessageReceivedEvent event) {

        if (event.getAuthor().isBot()) return;

        if (event.getMessage().getContentDisplay().equalsIgnoreCase("hey") || event.getMessage().getContentDisplay().equalsIgnoreCase("hallo")) {
            event.getTextChannel().sendMessage("HELLO").queue();
        }

    }
}
