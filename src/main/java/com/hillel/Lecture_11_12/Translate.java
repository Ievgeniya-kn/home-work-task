package com.hillel.Lecture_11_12;

public enum  Translate {
    SPAIN("Hola", "adiós"),
    FRENCH("Bonjour","au revoir"),
    GERMAN("Hallo","Tschüss");

    private String hello;
    private String bye;

    Translate(String hello, String bye) {
        this.hello=hello;
        this.bye=bye;
    }

    public String getHello() {
        return hello;
    }

    public String getBye() {
        return bye;
    }
}
