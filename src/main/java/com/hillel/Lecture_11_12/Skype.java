package com.hillel.Lecture_11_12;

public class Skype implements IMessenger {

    String[] messages = {"I need time to sleep", "Another time", "Keep Calm"};

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
        if (busy == true) {
            try {
                for (String mes : messages) {

                    if (mes.equalsIgnoreCase("Funny Day!!!"))
                        return mes;
                }
                CustomExceptions mess = new CustomExceptions("None Funny Day");
                throw mess;
            } catch (CustomExceptions me) {
                me.printStackTrace();
            } finally {
                return "I need time to sleep";
            }

        } else return "Look at your incredible funny messages ";
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

    public String testError(String text) {
        for (String mes : messages) {
            if (mes.equalsIgnoreCase(text)) {
                new AssertionError("You're not unique");
                return "non-unique";
            }
        } return "inique";
    }
}
