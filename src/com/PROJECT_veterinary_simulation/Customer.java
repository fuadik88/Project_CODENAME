package com.PROJECT_veterinary_simulation;

import java.util.ArrayList;

public class Customer extends People{
    private final String address;
    private final ArrayList<Animal> customerAnimals;

    public Customer(String name, String IDNum, String address) {
        super(name, IDNum);
        this.address = address;
        customerAnimals = new ArrayList<>();
    }

    @Override
    void hInfo() {
        System.out.println(toString() + "  -  Customer");
    }

    @Override
    <Stuff> void assign(Stuff anim) {
        customerAnimals.add((Animal) anim);
        System.out.println(anim + " *** ASSIGNED TO CUSTOMER " + getName() );
    }

    public ArrayList<Animal> getCustomerAnimals() {
        return customerAnimals;
    }

    @Override
    public String toString() {
        return "Customer  ---  " + super.toString() + "  |  Address: " + address;
    }
}
