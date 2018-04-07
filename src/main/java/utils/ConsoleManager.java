package utils;

import java.util.Calendar;

/**
 * Created by Kaan on 06.03.2018.
 */
public class ConsoleManager {


    public void sendConsoleStartMessage(){
        System.out.println("█▀▀█ █░█ █▀▀█ █▀▄▀█ █▀▀   █▀▀▄ █▀▀█ ▀▀█▀▀");
        System.out.println("█▄▄█ █▀▄ █▄▄█ █░▀░█ █▀▀   █▀▀▄ █░░█ ░░█░░");
        System.out.println("▀░░▀ ▀░▀ ▀░░▀ ▀░░░▀ ▀▀▀  ▀▀▀░ ▀▀▀▀ ░░▀░░");

        Calendar calendar = Calendar.getInstance();

        System.out.println(" ");
        System.out.println("ONLINE");
        System.out.println("Started: " + calendar.getTime().toString()) ;
        System.out.println("Author: Kaan Y.");
        System.out.println("Version: 1.0");
        System.out.println(" ");
    }

}
