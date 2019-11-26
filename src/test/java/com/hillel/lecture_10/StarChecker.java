package com.hillel.lecture_10;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class StarChecker {
    Star star = new Star("Sun", 1, "G", "V");

    @Test
    public void starWeightChecker() {
        assertEquals(star.starWeight(),"Main sequence stars (dwarf stars)");
    }

    @Test
    public void starClassChecker() {
        assertEquals(star.starColorFounder(),"White to Yellow");
    }

    @Test
    public void testGalaxyChecker() {
        assertEquals(star.testGalaxy(),"Star");
    }
}
