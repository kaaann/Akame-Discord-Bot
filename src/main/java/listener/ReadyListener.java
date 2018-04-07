package listener;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * Created by Kaan on 10.03.2018.
 */
public class ReadyListener extends ListenerAdapter {

    public void onReady(ReadyEvent event) {

        String onlinemsg = "\ncore.Akame online on: \n";

        for (Guild guild : event.getJDA().getGuilds()) {

            onlinemsg += guild.getName() + " | " + guild.getId() + "\n";
        }

        System.out.println(onlinemsg);



    }
}
