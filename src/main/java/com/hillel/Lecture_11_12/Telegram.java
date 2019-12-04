package com.hillel.Lecture_11_12;

import java.util.Random;

public class Telegram implements IMessenger {

    @Override
    public String sendMessage() {
        return "Nice day to visit";
    }

    @Override
    public String lastVisit() {
        Random random = new Random();
        int rand = random.nextInt(125);
        try {
            return lastVisit(rand);
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
         finally {
            return lastVisit(2);
        }

    }

    public String lastVisit(int rand) {
        DaysOfWeek[] days = DaysOfWeek.values();
        DaysOfWeek day = days[rand];
        return day.toString();
    }

    @Override
    public String busy(boolean busy) {
        if (busy == true) {
            return "Don't disturb from 8 PM - till 10 AM";
        } else return "Let's make a day better";
    }

    @Override
    public String online(boolean online) {
        return "I'm always online? " + online;
    }


    @Override
    public String translateHello() {
        Translate translateGerman = Translate.GERMAN;
        return translateGerman.getHello();
    }

    @Override
    public String translateBye() {
        Translate translateGerman = Translate.GERMAN;
        return translateGerman.getBye();
    }

    enum DaysOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}
