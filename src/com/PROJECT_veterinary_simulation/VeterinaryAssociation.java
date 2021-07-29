package com.PROJECT_veterinary_simulation;

import java.util.ArrayList;

public class VeterinaryAssociation {
    public static void main(String[] args) {
        Animal c1 = new Cat("19th of July, 2017", true, "Van");
        Animal d1 = new Dog("3rd of February, 2015", true, 9);
        Dog d2 = new Dog("17th of November, 2018", true, 5);
        ArrayList<Object> arraylist = new ArrayList<>();
        arraylist.add(c1);
        arraylist.add(d1);
        arraylist.add(d2);

        People cm1 = new Customer("Larry", "4879871564165", "NY str.");
        People v1 = new Vet("David", "4987985545851","Boston University",4);
        arraylist.add(cm1);
        arraylist.add(v1);
        cm1.assign(c1);
        cm1.assign(d1);
        v1.assign(cm1);
        System.out.println(((Customer)cm1).getCustomerAnimals());
        System.out.println(((Vet)v1).getVetCustomers());

        ControlPanel<Animal> anim = new ControlPanel();
        anim.wInfo(d1);

        anim.customerAnimals(((Customer)cm1));
        System.out.println(c1.isRegistered());
    }

    private static void  wArray(ArrayList<Object> array){
        for(Object r : array) System.out.println(r);
    }
}