package com.java.practice;

public class Student implements Comparable {
    private String name;
    private  double gpa;
    private int grade;

    public Student(String name, double gpa, int grade) {
        this.name = name;
        this.gpa = gpa;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getGrade() {
        return grade;
    }



    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if (this.getGpa()> other.getGpa()){
            return 1;
        } else if(this.getGpa()< other.getGpa()){
            return -1;
        } else if (this.getGrade()> other.grade){
            return 1;
        }else if(this.grade< other.getGrade()){
            return -1;
        } else
            return 0;

    }
}
