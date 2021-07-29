package com.OOP;

import java.util.Arrays;

public class ImmutableObj {
    public static void main(String[] args) {
        Comp[] collection = new Comp[10];
        Comp pc1 = new Comp(6,16, "HP, IBM");
        pc1.getSpecs();
        collection[0] = pc1;
        collection[0].getSpecs();
        Comp pc2 = new Comp(8,12,"Dell");
        collection[1] = pc2;
        wSpecs(pc2);
        collection[1].getSpecs();
        wSpecs(collection[1]);
    }

    private static void wSpecs(Comp pc){
        System.out.println(pc.getCore() + " core\n" + pc.getRam() + "gb RAM\n" + "Manufacturer: " + pc.getManufacturer());
    }
}
class Comp{
    private int core;
    private int ram;
    private String manufacturer;

    public Comp(int ccore, int cram, String cvendor){
        core = ccore; ram = cram; manufacturer = cvendor;
    }

    public int getCore() {
        return core;
    }

    public int getRam() {
        return ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void getSpecs(){
        System.out.println(core + " core\n" + ram + "gb RAM\n" + "Manufacturer: " + manufacturer);
    }
}
