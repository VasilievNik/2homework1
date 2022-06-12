package com.company;

public class Person {
    private final String firstName;
    private final String secondName;
    private final int powah;
    private final int distance;

    public Person(String firstName, String secondName, int powah, int distance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.powah = powah;
        this.distance = distance;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public int getPowah(){
        return this.powah;
    }
    public int getDistance(){
        return this.distance;
    }
}
