package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

  private String nameOfClass;
  private List<JavaStudent> javaStudentList;

  /**
   * En Konstruktör för klassen, som kommer innehålla en lista med studenter
   * @param incommingNameOfClass är namnet som klassen ska heta
   * som kommer IN i konstruktorn.
   */
  public ClassRoom(String incommingNameOfClass) {
    nameOfClass = incommingNameOfClass;
  }

  /**
   * Hämtar listan med Java Studenter
   * @return returnerar Java Studenter, som en lista,
   * ej en och en utan hela listan.
   */
  public List<JavaStudent> getJavaStudentList() {
    return javaStudentList;
  }

  /**
   * Ett sätt att sätta listan utifrån.
   * @param javaStudentList är listan av studenter som vi vill
   * att den här klassen ska ha
   */
  public void setJavaStudentList(List<JavaStudent> javaStudentList) {
    this.javaStudentList = javaStudentList;
  }

  /**
   * Vi har en getter för att hämta namnet på klassen så att vi kan se
   * sträng värdet. VI behöver ingen setter i de här exemplet, men det är
   * oftast användbart med.
   * @return namnet på klassen, som är String nameOfClass längre upp.
   */
  public String getNameOfClass() {
    return nameOfClass;
  }
}
