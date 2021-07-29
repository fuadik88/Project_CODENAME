package com.collection_framework;

import java.util.ArrayList;

public class ListsConcept {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.ensureCapacity(100);  //set the size of Arraylist for incoming bulk of data
        list.trimToSize();      //delete all empty fields to trim the Arraylist
        System.out.println(list.size());    //size of Arraylist
        System.out.println(list.isEmpty()); //returns boolean to say if Arraylist is empty
        list.clear(); //clear all elements of Arraylist

        String[] names = list.toArray(new String[0]); //convert Arraylist to Array.

    }
}
