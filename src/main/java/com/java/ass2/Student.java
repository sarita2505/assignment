package com.java.ass2;

import java.util.Objects;

public class Student {
    private String studentName;
    private int id;

    public Student() {
    }

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", name=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentName.equals(student.studentName);
      //  return true;
    }

    @Override
    public int hashCode() {
       // return Objects.hash(studentName);
        return 1;
    }
}
