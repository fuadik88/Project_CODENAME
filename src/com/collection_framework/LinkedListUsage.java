package com.collection_framework;

import java.util.LinkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        gen(list);
        System.out.println(list);

    }

    private static void gen(LinkedList<Integer> list){
        for(int i=0; i<10; i++)
            list.add((int)(Math.random()*20+1));
    }
}
