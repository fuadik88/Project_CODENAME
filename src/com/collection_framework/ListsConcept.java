package com.collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsConcept {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.ensureCapacity(100);  //set the size of Arraylist for incoming bulk of data
        list.trimToSize();      //delete all empty fields to trim the Arraylist
        System.out.println(list.size());    //size of Arraylist
        System.out.println(list.isEmpty()); //returns boolean to say if Arraylist is empty
        list.clear(); //clear all elements of Arraylist

        String[] names = list.toArray(new String[0]); //convert Arraylist to Array.
        List<String> newNames = list.subList(0,5); //get the elements between two indexes => from 0 to 5.
        System.out.println(newNames);

        list.addAll(list2); //add list2 elements to list1.
        list.addAll(2,list2); //add list2 elements to list1 starting from 2. index of list.

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(names));
        System.out.println(list3);
    }
}
