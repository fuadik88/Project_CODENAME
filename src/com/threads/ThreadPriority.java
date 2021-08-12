package com.threads;

public class ThreadPriority {
    public static void main(String[] args) {

    }
}

class OddCounter extends Thread{
    String name;

    public OddCounter(String name) {
        this.name = name;
    }
}