package com.collection_framework;

import java.util.ArrayList;

public class ListsConcept {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.ensureCapacity(100);  //set the size of Arraylist for incoming bulk of data
        list.trimToSize();      //delete all empty fields to trim the Arraylist
        System.out.println(list.size());
    }
}
