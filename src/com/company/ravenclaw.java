package com.company;

public class ravenclaw extends Person{
    private int intelligence;
    private int curiosity;
    private int creativity;

    public ravenclaw(String firstName, String secondName, int powah, int distance, int intelligence, int curiosity, int creativity) {
        super(firstName, secondName, powah, distance);
        this.intelligence = intelligence;
        this.curiosity = curiosity;
        this.creativity = creativity;
    }

    public int getIntelligence(){
        return this.intelligence;
    }
    public int getCuriosity(){
        return this.curiosity;
    }
    public int getCreativity(){
        return this.creativity;
    }

    public String toString(){
        return "Имя: "+this.getFirstName()+"\nФамилия: "+this.getSecondName()+"\nСила: "+this.getPowah()+"\nДистанция: "+this.getDistance()+"\nintelligence: "+intelligence+"\ncuriosity: "+curiosity+"\ncreativity: "+creativity+"\n";
    }
}
