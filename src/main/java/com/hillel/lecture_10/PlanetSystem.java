package com.hillel.lecture_10;

import java.util.Random;

public class PlanetSystem extends Galaxy {
    int qtyOfPlanet;

    public PlanetSystem(String name, int id, int qtyOfPlanet) {
        super(name, id);
        this.qtyOfPlanet = qtyOfPlanet;
    }


    public PlanetSystem(String name, int id) {
        super(name, id);
    }


    @Override
    public String testGalaxy() {
        switch (qtyOfPlanet) {
            case 8:
                return "Solar System";
            case 24000000:
                return "Milky Way";
            default:
                return "Far far away Universe";
        }

    }
}
