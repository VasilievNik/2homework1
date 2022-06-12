package com.company;

public class hufflepuff extends Person{
    private final int work;
    private final int loyalty;
    private final int truth;

    public hufflepuff(String firstName, String secondName, int powah, int distance, int work, int loyalty, int truth) {
        super(firstName, secondName, powah, distance);
        this.work = work;
        this.loyalty = loyalty;
        this.truth = truth;
    }

    public int getWork(){
        return this.work;
    }
    public int getLoyalty(){
        return this.loyalty;
    }
    public int getTruth(){
        return this.truth;
    }

    public String toString(){
        return "Имя: "+this.getFirstName()+"\nФамилия: "+this.getSecondName()+"\nСила: "+this.getPowah()+"\nДистанция: "+this.getDistance()+"\nwork: "+work+"\nloyalty: "+loyalty+"\ntruth: "+truth+"\n";
    }
}
