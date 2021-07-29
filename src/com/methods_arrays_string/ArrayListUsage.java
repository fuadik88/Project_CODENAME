package com.methods_arrays_string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUsage {
    public static void main(String[] args) {
        //Smartphone[] sms = new Smartphone[3];
        Smartphone sm1 = new Smartphone("Xiaomi mi 11", 799);
        Smartphone sm2 = new Smartphone("Huawei P40 Pro", 899);
        Smartphone sm3 = new Smartphone("Oneplus 9", 879);
        /*sms[0] = sm1;
        sms[1] = sm2;
        sms[2] = sm3;
        System.out.println(Arrays.toString(sms));*/

        ArrayList<Smartphone> sms = new ArrayList<>();
        /*sms.add(sm1);
        System.out.println(sms.get(0));
        sms.add(0,sm2);
        System.out.println(sms.get(0));*/

        sms.add(sm1); sms.add(sm2); sms.add(sm3); //adds value to the left of the specified index and shifts the current.
        wArrayList(sms);
        sms.set(1, sm3); //replaces the index with another value.
        wArrayList(sms);
        sms.remove(sm1);  //removes object or index.
        sms.remove(1);
        System.out.println("-----------------------------");
        wArrayList(sms);

    }
    private static void wArrayList(ArrayList<Smartphone> alist){
        /*for(byte i=0; i<alist.size(); i++)
            System.out.println((i+1) + ". element = " + alist.get(i));*/
        for(Smartphone r : alist)
            System.out.println(r);
    }
}

class Smartphone{
    private final String model; private final int price;
    public Smartphone(String model, int price){
        this.model = model; this.price = price;
    }

    @Override
    public String toString() {
        return
                "Model: " + model +
                " | Price: " + price;
    }
}
