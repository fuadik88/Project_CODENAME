package com.OOP;

public class Encapsulation {
    public static void main(String[] args) {
        Student david = new Student(8, "David", (byte) 8, true);
        david.wStudentInfo();
        david.setStudentInfo(10,"Davud", (byte) 11);
        david.wStudentInfo();

        Television sony = new Television();
        sony.setChannel(5);
        sony.turnOn();
        sony.setVolumeLevel(35);
        sony.turnOff();
        sony.status();
        sony.turnOn();
        sony.status();
        System.out.println(Television.tvDiode);
    }
}
