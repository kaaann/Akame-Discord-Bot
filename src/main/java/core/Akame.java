package core;

import commands.HelpCommand;
import commands.PingCommand;
import utils.Changeable;
import listener.MessageReceivedListener;
import listener.ReadyListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import utils.ConsoleManager;

import javax.security.auth.login.LoginException;

/**
 * Created by Kaan on 06.03.2018.
 */
public class Akame {

    public static JDA jda;

    public static void main(String[] args){

        ConsoleManager console = new ConsoleManager();
        JDABuilder builder = new JDABuilder(AccountType.BOT);

        builder.setToken("xxx");
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setGame(Game.listening(Changeable.prefix + "help"));
        builder.setAutoReconnect(true);


        //events.
        builder.addEventListener(new ReadyListener());
        builder.addEventListener(new MessageReceivedListener());

        //cmds.
        builder.addEventListener(new HelpCommand());
        builder.addEventListener(new PingCommand());


        try {
            jda = builder.buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        console.sendConsoleStartMessage();
    }

}
