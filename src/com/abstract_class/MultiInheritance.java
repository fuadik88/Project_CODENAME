package com.abstract_class;

public class MultiInheritance {                                 //Using INTERFACE
    public static void main(String[] args) {
        RockSingerDos pop1 = new VersatileSinger();
        pop1.drum();
    }
}

interface PopSingerDos{
    void dance();
}

interface RockSingerDos{
    void drum();
}

abstract class Singer{
    abstract void sing();
}

class PopSinger extends Singer{

    @Override
    void sing() {
        System.out.println("Pop singer sings...");
    }

    void dance(){
        System.out.println("Pop singer dancing...");
    }
}

class RockSinger extends Singer{

    @Override
    void sing() {
        System.out.println("Rock singer sings...");
    }

    void drum(){
        System.out.println("Rock singer drumming...");
    }
}

class VersatileSinger implements RockSingerDos, PopSingerDos{

    @Override
    public void dance() {
        System.out.println("Versatile Pop singer dancing...");
    }

    @Override
    public void drum() {
        System.out.println("Versatile Rock singer drumming...");
    }
}


