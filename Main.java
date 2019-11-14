package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Den här Main klassen nyttjar klassernas relationer,
     * den sätter objekt mellan objekt genom SETTER
     *
     * Bra repitition med för det vi precis gjort!
     * @param args
     */
    public static void main(String[] args) {
        // Vi vill att studenten ska veta om vilken klass han går till.. så vi gör en klass:
        ClassRoom javaClassRoom2018 = new ClassRoom("Java Höstterminen 2018");

        // Sedan skapar vi två studenter.
        JavaStudent studentKarl = new JavaStudent("Karl Karlsson");
        JavaStudent studentRobin = new JavaStudent("Robin Robinsson");

        // Sedan sätter vi klassrummet på studenten.
        studentKarl.setClassRoom(javaClassRoom2018);
        studentRobin.setClassRoom(javaClassRoom2018);

        // Nu kollar vi vilken skola som Karl och Robin går till:
        System.out.println(studentKarl.getStudentName() + " går till: " + javaClassRoom2018.getNameOfClass());
        System.out.println(studentRobin.getStudentName() + " går till: " + javaClassRoom2018.getNameOfClass());

        // Om vi vill göra ett gäng studenter och lägga in dem
        // i ett klassrum, så att klassrummet äger studenterna gör vi såhär:

        // Först skapar vi studenter
        JavaStudent studentKalle = new JavaStudent("Kalle Karlsson");
        JavaStudent studentPelle = new JavaStudent("Pelle Pellesson");
        JavaStudent studentNiklas = new JavaStudent("Niklas Nilsson");
        JavaStudent studentPer = new JavaStudent("Per Persson");
        JavaStudent studentNils = new JavaStudent("Nils Nilsson");

        // Sen skapar vi ett klassrum
        ClassRoom javaClassRoom2019 = new ClassRoom("Java Höstterminen 2019");
        List<JavaStudent> listanAvStudenter = new ArrayList<>();
        listanAvStudenter.add(studentKalle);
        listanAvStudenter.add(studentPelle);
        listanAvStudenter.add(studentNiklas);
        listanAvStudenter.add(studentPer);
        listanAvStudenter.add(studentNils);

        // Sedan sätter vi listan till Klassrummet 2019.
        javaClassRoom2019.setJavaStudentList(listanAvStudenter);

        for (JavaStudent j : javaClassRoom2019.getJavaStudentList()) {
            System.out.println(javaClassRoom2019.getNameOfClass() + " has student: " + j.getStudentName());
        }

        // Vi gör en dubbelriktad relation, där studenterna vet vilken klass de tillhör och
        // klassen vet vilka studenter som kommer.
        // (Och nu såhär långt kommer jag på att jag inte använt kvinnliga namn så
        // vi kan göra en kvinnlig klass)

        // Vi gör både klass och student i ett svep:
        ClassRoom javaClassRoomFemalesOnly = new ClassRoom("Kvinnliga Java Klassen");
        JavaStudent josefinStudent = new JavaStudent("Josefin Josefinsson");
        JavaStudent erikaStudent = new JavaStudent("Erika Eriksson");
        JavaStudent jonnaStudent = new JavaStudent("Jonna Jonsson");


        // Först skapar vi en tom lista den här gången som vi slänger in:
        List<JavaStudent> javaStudentsFemale = new ArrayList<>();
        // Nu initierar vi ArrayListan och lägger in den till objektet javaClassRoomFemalesOnly:
        javaClassRoomFemalesOnly.setJavaStudentList(javaStudentsFemale);

        // Nu sätter vi relationen på båda hållen:
        javaClassRoomFemalesOnly.getJavaStudentList().add(josefinStudent);
        josefinStudent.setClassRoom(javaClassRoomFemalesOnly);

        javaClassRoomFemalesOnly.getJavaStudentList().add(erikaStudent);
        erikaStudent.setClassRoom(javaClassRoomFemalesOnly);

        javaClassRoomFemalesOnly.getJavaStudentList().add(jonnaStudent);
        jonnaStudent.setClassRoom(javaClassRoomFemalesOnly);

        // Nu testar vi! Har vi en dubbelriktad relation mellan dessa?
        System.out.println("Vilken klass går " + josefinStudent.getStudentName() + " till? ");
        System.out.println("Svar: " + josefinStudent.getClassRoom().getNameOfClass());

        // Testa se om resten går i klassen, eller gör en for loop för att se vilka som tillhör!
    }
}
