package com.company;

public class gryffindor extends hogwarts {
    private int bravery;
    private int daring;
    private int chivalry;

    public gryffindor(String firstName, String secondName, int powah, int distance, int bravery, int daring, int chivalry) {
        super(firstName, secondName, powah, distance);
        this.bravery = bravery;
        this.daring = daring;
        this.chivalry = chivalry;
    }

    public int getBravery(){
        return this.bravery;
    }
    public int getDaring(){
        return this.daring;
    }
    public int getChivalry(){
        return this.chivalry;
    }

    public String toString(){
        return "Имя: "+this.getFirstName()+"\nФамилия: "+this.getSecondName()+"\nСила: "+this.getPowah()+"\nДистанция: "+this.getDistance()+"\nbravery: "+bravery+"\ndaring: "+daring+"\nchivalry: "+chivalry+"\n";
    }

}
