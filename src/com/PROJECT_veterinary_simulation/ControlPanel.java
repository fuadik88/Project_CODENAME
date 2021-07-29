package com.PROJECT_veterinary_simulation;

public class ControlPanel<type> {
    public void wInfo(type obj){
        System.out.println(obj);
    }

    public <typo extends Customer>void customerAnimals(typo cm){
        System.out.println(cm.getCustomerAnimals());
    }
}
