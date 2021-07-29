package com.OOP;

public class Student {
     int ID; String name; byte sclass; boolean t; //to make variables inaccessible
    // by other classes, use private in front. Ex: private int ID;

    public void setStudentInfo(int id, String sname, byte cclass){ //a method to modify the variables
        ID = id; name = sname; sclass = cclass;                   //those are inaccessible due to "private" setting
    }

    public Student(){
    }

    public Student(String sname){
        name = sname;
    }

    public Student(int sID, String sname, byte cclass, boolean at){
        ID = sID; name = sname; sclass=cclass; t = at;
    }

    public void isActive(){
        System.out.println("Currently participating in lessons.");
    }

    public void wStudentInfo(){
        if(t) System.out.println("Name: " + name + " ID: " + ID + " Class: " + sclass);
        else System.out.println("Student is inactive!");
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
