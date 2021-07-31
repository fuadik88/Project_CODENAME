package com.collection_framework;

import java.util.Comparator;
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

        TreeMap<Anime, Integer> map2 = new TreeMap<>(new Comparator<Anime>() {
            @Override
            public int compare(Anime o1, Anime o2) {
                return Integer.compare(o1.episode, o2.episode);
            }
        });
        Anime a1 = new Anime(5,"erfwe");
        Anime a2 = new Anime(13,"asdas");
        Anime a3 = new Anime(8,"kguyhfgh");
        Anime a4 = new Anime(3,"gfghd");

        map2.put(a1,7);
        map2.put(a2,45);
        map2.put(a3,21);
        map2.put(a4,10);
        System.out.println(map2); //prints keys and values >> a1=7
        System.out.println(map2.keySet()); //prints only keys >> a1
        System.out.println(map2.values()); //prints only values >> 7

    }
}

class Anime{
    int episode;
    String bride;

    public Anime(int episode, String bride){
        this.episode = episode;
        this.bride = bride;
    }

    @Override
    public String toString() {
        return "Episode > " + episode + " . Bride > " + bride;
    }
}
