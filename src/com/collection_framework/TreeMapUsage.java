package com.collection_framework;

import java.util.TreeMap;

public class TreeMapUsage {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Ab", 63);
        map.put("De", 87);
        map.put("Ef", 14);
        map.put("Ci", 32);
        map.put("Bad", 6);
        map.put("Sort", 8);
        map.put("Xeon", 45);
        System.out.println(map);

    }
}
