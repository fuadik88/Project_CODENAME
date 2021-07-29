package com.generics_concept;

public class GenericPrintArray<datatype> {
    public void wArray(datatype[] array){
        for(datatype r : array) System.out.println(r);
    }
}
