package com.methods_arrays_string;

public class AdvancedArrays {
    public static void main(String[] args) {    //for-each loop
        int[] at = {10,5,-3,44,36};
        for(int el : at)
            System.out.println("Element> " + el);
        String[] names = {"asda","rtrt","sdfs","weqe"};
        for(String hell : names)
            System.out.println("String> " + hell);

        printArrays(names);
    }
    private static void printArrays(String[] namearray){
        for(String hell : namearray){
            System.out.println("Name> " + hell);
        }
    }
}
