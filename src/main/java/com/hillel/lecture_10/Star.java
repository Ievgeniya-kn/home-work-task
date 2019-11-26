package com.hillel.lecture_10;

public class Star extends Galaxy {
    String starWeight;
    String starClass;

    public Star(String name, int id,String starClass,String starWeight) {
        super(name, id);
        this.starWeight = starWeight;
        this.starClass = starClass;
    }

    public String starColorFounder() {
        switch (starClass) {
            case "O":
                return "Blue";
            case "A":
                return "Blue";
            case "B":
                return "Blue";
            case "F":
                return "Blue to White";
            case "G":
                return "White to Yellow";
            case "K":
                return "Orange to Red";
            case "M":
                return "Red";
            default:
                return "Uknown planet's type";
        }
    }

    public String starWeight() {
        switch (starWeight) {
            case "Ia":
                return "Very luminous supergiants";
            case "Ib":
                return "Less luminous supergiants";
            case "II":
                return "Luminous giants";
            case "III":
                return "Giants";
            case "IV":
                return "Subgiants";
            case "V":
                return "Main sequence stars (dwarf stars)";
            case "VI":
                return "Subdwarf";
            case "VII":
                return "White Dwarf";
            default:
                return "Uknown planet's type";
        }
    }


    @Override
    public String testGalaxy() {
        return "Star";
    }
}
