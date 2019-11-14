package com.company;

public class JavaStudent {

  private String studentName;
  private ClassRoom classRoom;

  /**
   * Constructor som specificerar namnet på klassen
   * @param incommingStudentName är namnet som student ska heta
   * som kommer IN i konstruktorn.
   */
  public JavaStudent(String incommingStudentName){
    studentName = incommingStudentName;
  }

  /**
   * returnerar namnet på student.
   * @return namnet som objektet student har.
   */
  public String getStudentName() {
    return studentName;
  }

  /**
   * Ett sätt att sätta namnet på studenten.
   * @param studentName är namnet som vi sätter på Student objektet
   * {@link JavaStudent}
   */
  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  /**
   * Reutrnerar klassen som studenten tillhör
   * @return klassen som den här studenten är kopplad till.
   */
  public ClassRoom getClassRoom() {
    return classRoom;
  }

  /**
   * Sätter klassen som studenten ska tillhöra.
   * @param classRoom är klassen som vi vill att den här studenten
   * går till.
   */
  public void setClassRoom(ClassRoom classRoom) {
    this.classRoom = classRoom;
  }
}
