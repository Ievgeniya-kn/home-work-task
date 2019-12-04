package com.hillel.lecture_11_12;

import static org.testng.Assert.assertEquals;
import com.hillel.Lecture_11_12.Skype;
import org.testng.annotations.Test;

public class SkypeTest {

    Skype skype=new Skype();

    @Test
    public void SkypeSendMessageChecker() {
        assertEquals(skype.sendMessage()," I'm a robot");
    }

    @Test
    public void SkypeBusyChecker() {
        assertEquals(skype.busy(true),"I need time to sleep");
    }

    @Test
    public void SkypeLastVisitChecker() {
        assertEquals(skype.lastVisit(),"a second ago");
    }

    @Test
    public void SkypeOnlineChecker() {
        assertEquals(skype.online(false),"Oops. smth wrong ....");
    }

    @Test
    public void SkypeTranslateFrenchChecker() {
        assertEquals(skype.translateHello(),"Bonjour");
    }

    @Test
    public void SkypeUniqueMessage() {assertEquals(skype.testError("Keep Calm"),"non-unique");    };
}
