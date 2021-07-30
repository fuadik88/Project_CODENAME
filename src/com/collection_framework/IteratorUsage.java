package com.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorUsage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        gen(list);
        gen(list2);
        System.out.println(list);
        System.out.println(list2);
        Iterator<Integer> ride = list.iterator();
        //while(ride.hasNext()) System.out.print(ride.next() + " ");

        ListIterator<Integer> ridelist = list.listIterator();

        while(ridelist.hasNext()){
            if(list2.contains(ridelist.next())) {
                ridelist.remove();
            }
        }

        ListIterator<Integer> revert = list2.listIterator(list2.size());
        while(revert.hasPrevious())                     //Print list reverseOrder.
            System.out.println("index: "+ revert.previousIndex() + " > contains " + revert.previous()+" | ");


        System.out.println("--------------------------");
        System.out.println(list);
        System.out.println(list2);

    }
    private static void gen(ArrayList<Integer> list){
        for(int i=0; i<10; i++){
            list.add((int)(Math.random()*10+1));
        }
    }
}
