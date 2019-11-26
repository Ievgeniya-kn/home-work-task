package com.hillel.lecture_10;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class PlanetSystemChecker {
    PlanetSystem planetSystem = new PlanetSystem("Test",3423423,8);

    @Test
    public  void testGalawyChecker() {
        assertEquals(planetSystem.testGalaxy(),"Solar System");
    }

}
