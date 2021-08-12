package com.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Footman{
    String shuffle = "qwertyuiop[]';lkjhgfdsazxcvbnm,./12334567890-=*/-+!@#&$^%+_)(*";
    static String a;
    static String b;
    static String c;

    private Footman(String a, String b, String c){
        Footman.a = gen(); Footman.b = gen(); Footman.c = gen();
    }

    static ArrayList<Footman> wList(ArrayList<Footman> list){
        new Thread(() -> {
            Footman f = new Footman(a, b, c);
            list.add(f);
        });
        return list;
    }

    String gen(){
        List<String> list = Arrays.asList(shuffle.split(""));
        Collections.shuffle(list);
        String afterShuffle = "";
        for(String r : list){
            afterShuffle += r;
        }
        System.out.println(afterShuffle);
        return afterShuffle;
    }

    @Override
    public String toString() {
        return "Footman{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
