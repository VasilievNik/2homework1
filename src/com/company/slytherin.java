package com.company;

public class slytherin extends hogwarts {
    private int cunning;
    private int ambition;
    private int leadership;

    public slytherin(String firstName, String secondName, int powah, int distance, int cunning, int ambition, int leadership) {
        super(firstName, secondName, powah, distance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.leadership = leadership;
    }

    public int getCunning(){
        return this.cunning;
    }
    public int getAmbition(){
        return this.ambition;
    }
    public int getLeadership(){
        return this.leadership;
    }

    public String toString(){
        return "Имя: "+this.getFirstName()+"\nФамилия: "+this.getSecondName()+"\nСила: "+this.getPowah()+"\nДистанция: "+this.getDistance()+"\ncunning: "+cunning+"\nambition: "+ambition+"\nleadership: "+leadership+"\n";
    }
}
