package com.hillel.Lecture_11_12;

public class Skype implements IMessenger {

    @Override
    public String sendMessage() {
        return " I'm a robot";
    }

    @Override
    public String lastVisit() {
        return "a second ago";
    }

    @Override
    public String busy(boolean busy) {
        if (busy == true) return "I need time to sleep";
        else return "Look at your incredible funny messages ";
    }

    @Override
    public String online(boolean online) {
        if (online == true)
            return "I'm here";
        else return "Oops. smth wrong ....";
    }

    @Override
    public String translateHello() {
        Translate french = Translate.FRENCH;
        return french.getHello();
    }

    @Override
    public String translateBye() {
        Translate french = Translate.FRENCH;
        return french.getBye();
    }
}
