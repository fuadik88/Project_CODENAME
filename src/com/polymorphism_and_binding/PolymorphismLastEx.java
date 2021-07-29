package com.polymorphism_and_binding;

public class PolymorphismLastEx {
    public static void main(String[] args) {
        Animal anime = new Animal();
        Eagle eagle = new Eagle();
        Panda panda = new Panda();
        Animal panda1 = new Panda();
        ((Panda)panda1).play();
    }
}

class Animal{
    public void wName(){
        System.out.println("I am Animal class Object");
    }
}

class Eagle extends Animal{
    @Override
    public void wName() {
        System.out.println("I am Eagle class Object");
    }
    public void fly(){
        System.out.println("I believe, I can fly");
    }
}

class Panda extends Animal{
    @Override
    public void wName() {
        System.out.println("I am Panda class Object");
    }
    public void play(){
        System.out.println("I lavva play");
    }
}
