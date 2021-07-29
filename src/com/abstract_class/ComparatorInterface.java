package com.abstract_class;

import java.util.Arrays;

public class ComparatorInterface {
    public static void main(String[] args) {
        Student std1 = new Student(6,"Alex");
        Student std2 = new Student(3,"Peter");
        Student std3 = new Student(2,"Morgana");
        Student std4 = new Student(12,"Henry");

        Student[] students = {std1,std2,std3,std4};
        System.out.println("Before sorting:");
        wArray(students);
        Arrays.sort(students);
        System.out.println("After sorting:");
        wArray(students);
    }
    private static void wArray(Student[] sArray){
        for(Student r : sArray)
            System.out.println(r);
    }
}

class Student implements Comparable<Student>{
    private final int id; private final String name;

    public Student(int pid, String pname){
        this.id = pid; this.name=pname;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);           //sort by number sequence.
    }

    /* @Override
    public int compareTo(Student o) {
        return CharSequence.compare(o.name, this.name);  //sort by char sequence.
    } */
}
