package com.hillel.lecture_10;

public abstract class Galaxy {
    String name;
    int id;

    public Galaxy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public abstract String testGalaxy();
}
