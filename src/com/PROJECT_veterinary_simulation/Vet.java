package com.PROJECT_veterinary_simulation;

import java.util.ArrayList;

public class Vet extends People {
    String school;
    int upTime;
    private final ArrayList<Customer> vetCustomers;

    public ArrayList<Customer> getVetCustomers() {
        return vetCustomers;
    }

    public Vet(String name, String IDNum, String school, int upTime) {
        super(name, IDNum);
        this.school = school;
        this.upTime = upTime;
        vetCustomers = new ArrayList<>();
    }

    @Override
    void hInfo() {
        System.out.println(toString() + " - Veterinarian");
    }

    @Override
    <Stuff> void assign(Stuff cm) {
        vetCustomers.add((Customer) cm);
        System.out.println(cm + " *** ASSIGNED TO VETERINARIAN " + getName());
    }

    /*@Override
    void assign(Customer asd) {
        vetCustomers.add(asd);
        System.out.println(asd + " *** ASSIGNED TO VETERINARIAN " + getName());
    }*/

    @Override
    public String toString() {
        return "Veterinarian  ---  " + super.toString() + "  |  School: " + school + "  |  Working since: " + upTime;
    }
}
