package com.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Footman> list = new ArrayList<>();
        System.out.println("Hi");
        Thread.sleep(1000);

        System.out.println("end"); //this runs without waiting start method to finish, because of separate Threads.
        generate(list);
    }

    private static void generate(ArrayList<Footman> footmen){
        String a;
        for (;;) {
            System.out.println(Footman.wList(footmen));
        }
    }
}
