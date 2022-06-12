package com.company;

public class Main {

    public static hufflepuff[] studentsH = new hufflepuff[3];
    public static gryffindor[] studentsG = new gryffindor[3];
    public static slytherin[] studentsS = new slytherin[3];
    public static ravenclaw[] studentsR = new ravenclaw[3];

    public static void main(String[] args) {
        hufflepuff Zaharia_Smith = new hufflepuff("Zaharia", "Smith", 99, 12, 1000, 6, 7);
        studentsH[0] = Zaharia_Smith;
        hufflepuff Seddric_Diggory = new hufflepuff("Seddric", "Diggory", 69, 17, 15, 34, 143);
        studentsH[1] = Seddric_Diggory;
        hufflepuff Jastin_Fintch = new hufflepuff("Jastin", "Fintch", 79, 12, 54, 82, 77);
        studentsH[2] = Jastin_Fintch;

        gryffindor Zaharia_Smith1 = new gryffindor("Zaharia1", "Smith1", 99, 12, 1000, 6, 7);
        studentsG[0] = Zaharia_Smith1;
        gryffindor Seddric_Diggory1 = new gryffindor("Seddric1", "Diggory1", 69, 17, 15, 34, 143);
        studentsG[1] = Seddric_Diggory1;
        gryffindor Jastin_Fintch1 = new gryffindor("Jastin1", "Fintch1", 79, 12, 54, 82, 77);
        studentsG[2] = Jastin_Fintch1;

        slytherin Zaharia_Smith2 = new slytherin("Zaharia2", "Smith2", 99, 12, 1000, 6, 7);
        studentsS[0] = Zaharia_Smith2;
        slytherin Seddric_Diggory2 = new slytherin("Seddric2", "Diggory2", 69, 17, 15, 34, 143);
        studentsS[1] = Seddric_Diggory2;
        slytherin Jastin_Fintch2 = new slytherin("Jastin2", "Fintch2", 79, 12, 54, 82, 77);
        studentsS[2] = Jastin_Fintch2;

        ravenclaw Zaharia_Smith3 = new ravenclaw("Zaharia3", "Smith3", 99, 12, 1000, 6, 7);
        studentsR[0] = Zaharia_Smith3;
        ravenclaw Seddric_Diggory3 = new ravenclaw("Seddric3", "Diggory3", 69, 17, 15, 34, 143);
        studentsR[1] = Seddric_Diggory3;
        ravenclaw Jastin_Fintch3 = new ravenclaw("Jastin3", "Fintch3", 79, 12, 54, 82, 77);
        studentsR[2] = Jastin_Fintch3;

        hufflepuffBestStudent();
        gryffindorBestStudent();
        slytherinBestStudent();
        ravenclawBestStudent();

    }

    public static void hufflepuffBestStudent(){
        hufflepuff BestStudent = null;
        for(int i=0; i<studentsH.length-1; i++){
            if(studentsH[i].getTruth()+studentsH[i].getLoyalty()+studentsH[i].getWork()<studentsH[i+1].getTruth()+studentsH[i+1].getLoyalty()+studentsH[i+1].getWork()){
                BestStudent = studentsH[i+1];
            }
        }
        System.out.println("Лучший студент Пуффендуй:");
        System.out.println(BestStudent);
    }

    public static void gryffindorBestStudent(){
        gryffindor BestStudent1 = null;
        for(int i=0; i<studentsG.length-1; i++){
            if(studentsG[i].getBravery()+studentsG[i].getChivalry()+studentsG[i].getDaring()<studentsG[i+1].getBravery()+studentsG[i+1].getChivalry()+studentsG[i+1].getDaring()){
                BestStudent1 = studentsG[i+1];
            }
        }
        System.out.println("Лучший студент Гриффиндор:");
        System.out.println(BestStudent1);
    }

    public static void slytherinBestStudent(){
        slytherin BestStudent2 = null;
        for(int i=0; i<studentsS.length-1; i++){
            if(studentsS[i].getAmbition()+studentsS[i].getCunning()+studentsS[i].getLeadership()<studentsS[i+1].getAmbition()+studentsS[i+1].getCunning()+studentsS[i+1].getLeadership()){
                BestStudent2 = studentsS[i+1];
            }
        }
        System.out.println("Лучший студент Слизерин:");
        System.out.println(BestStudent2);
    }

    public static void ravenclawBestStudent(){
        ravenclaw BestStudent3 = null;
        for(int i=0; i<studentsR.length-1; i++){
            if(studentsR[i].getCreativity()+studentsR[i].getCuriosity()+studentsR[i].getIntelligence()<studentsR[i+1].getCreativity()+studentsR[i+1].getCuriosity()+studentsR[i+1].getIntelligence()){
                BestStudent3 = studentsR[i+1];
            }
        }
        System.out.println("Лучший студент Коктевран:");
        System.out.println(BestStudent3);
    }

    public static void BestStudentOfTwo(){ //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Как я сюда могу передать двух студентов разных типов, не зная заренне, что это будут за типы?
    }

}
