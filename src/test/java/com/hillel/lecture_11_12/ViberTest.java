package com.hillel.lecture_11_12;
import com.hillel.Lecture_11_12.ViberMessenger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ViberTest {
    ViberMessenger viberMessenger=new ViberMessenger();

    @Test
    public void ViberBusyChecker() {
        assertEquals(viberMessenger.busy(false),"Any news?");
    }

    @Test
    public void ViberOnlineChecker() {
        assertEquals(viberMessenger.online(false),"User is offline");
    }

    @Test
    public void ViberTranslateSpainChecker() {
        assertEquals(viberMessenger.translateHello()+" - "+viberMessenger.translateBye(),"Hola - adiós");
    }

    @Test
    public void ViberLastVisitChecker() {
        assertEquals(viberMessenger.lastVisit(),"Last visit was 1 day ago");
    }

    @Test
    public void ViberMessageChecker() {
        assertEquals(viberMessenger.sendMessage(),"Hello. Let's have a talk");
    }

}
