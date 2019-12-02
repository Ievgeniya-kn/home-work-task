package com.hillel.lecture_11_12;

import com.hillel.Lecture_11_12.Telegram;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TelegramTest {

    Telegram telegram = new Telegram();

    @Test
    public void assertTelegramSendMessageChecker() {
        assertEquals(telegram.sendMessage(),"Nice day to visit");
    }

    @Test
    public void assertTelegramBusy() {
        assertEquals(telegram.busy(true), "Don't disturb from 8 PM - till 10 AM");
    }

    @Test
    public void assertTelegramOnline() {
        assertEquals(telegram.online(false), "I'm always online? false");
    }

    @Test
    public void assertTelegramTranslateToGerman() {
        assertEquals(telegram.translateHello() + " - " + telegram.translateBye(), "Hallo - Tschüss");
    }

    @Test
    public void assertTelegram() {
        assertEquals(telegram.lastVisit(2), "TUESDAY");
    }
}