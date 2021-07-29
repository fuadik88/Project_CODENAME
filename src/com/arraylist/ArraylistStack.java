package com.arraylist;

import com.OOP.Student;

import java.util.ArrayList;

public class ArraylistStack {
    public static void main(String[] args) {
        Stack st1 = new Stack();
        Student s1 = new Student("Fuad");
        Student s2 = new Student("Anime");
        st1.push(s1); st1.push(s2);
        st1.wArraylist();
        System.out.println(st1.pop());
        st1.wArraylist();


    }
}

class Stack{
    private final ArrayList<Object> personnel;

    public Stack(){
        personnel = new ArrayList<>();
    }

    public int arraysize(){
        return personnel.size();
    }

    public boolean empty(){
        return personnel.size() <= 0;
    }

    public Object lastELement(){
        return personnel.get(arraysize()-1);
    }

    public Object pop(){
        personnel.remove(arraysize()-1);
        return personnel.get(arraysize()-1);
    }

    public void push(Object parameter){
        personnel.add(parameter); //adds to last
    }

    public void wArraylist(){
        System.out.println("--- Stack content ---");
        for(Object r : personnel){
            System.out.println(r);
        }
    }
}
