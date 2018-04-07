package commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import utils.Changeable;

public class PingCommand extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event){

        if(event.getAuthor().isBot()) return;

        if(event.getMessage().getContentDisplay().equalsIgnoreCase(Changeable.prefix + "ping")){
            event.getTextChannel().sendMessage("pong!").queue();

        }
    }
}
