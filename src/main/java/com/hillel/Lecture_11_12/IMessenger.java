package com.hillel.Lecture_11_12;

public interface IMessenger {

    String sendMessage();

    String lastVisit();

    String busy(boolean busy);

    String online(boolean online);

    String translateHello();

    String translateBye();


}
