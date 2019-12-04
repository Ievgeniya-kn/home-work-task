package com.hillel.Lecture_11_12;

public class ViberMessenger implements IMessenger {
    final String messengerName = "Viber";

    @Override
    public String sendMessage() {
        return "Hello. Let's have a talk";
    }

    @Override
    public String lastVisit() {
        return "Last visit was 1 day ago";
    }

    @Override
    public String busy(boolean busy) {
        if (busy == true) {
            return "Sorry, I'm busy now.";
        } else
            return "Any news?";

    }

    @Override
    public String online(boolean online) {
        try {
            int result= 5/0;
        } catch(ArithmeticException ex) {
            System.err.println(ex.getStackTrace());
            ex.printStackTrace();
        }
        finally {
            if (online == true)
                return "User is online";
            else return "User is offline";
        }
    }

    @Override
    public String translateHello() {
        Translate translateSpain = Translate.SPAIN;
        return translateSpain.getHello();

    }

    @Override
    public String translateBye() {
        Translate translateSpain = Translate.SPAIN;
        return translateSpain.getBye();
    }
}