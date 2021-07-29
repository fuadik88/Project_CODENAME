package com.generics_concept;

public class GenericClass {
    public static void main(String[] args) {
        String[] nameList = {"harry", "peter", "Gwen", "Norman"};
        Integer[] numList = {4,8,5,33,41,12};
        Character[] charList = {'f', '7', '$', 't'};

        //int>Integer, char>Character double>Double float>Float
       /* GenericPrintArray<String> wStrArray = new GenericPrintArray<>();
        wStrArray.wArray(nameList);
        GenericPrintArray<Integer> wIntArray = new GenericPrintArray<>();
        wIntArray.wArray(numList);
        GenericPrintArray<Character> wCharArray = new GenericPrintArray<>();
        wCharArray.wArray(charList);*/

        /*wArray(nameList);
        wArray(numList);
        wArray(charList);*/

        genericArray(nameList); genericArray(numList); genericArray(charList);
    }

    private static void wArray(Object[] array){
        for(Object r : array) System.out.println(r);        //non-generic method
    }

    private static <base> void genericArray(base[] array){  //generic method
        for(base r : array) System.out.println(r);
    }
}
