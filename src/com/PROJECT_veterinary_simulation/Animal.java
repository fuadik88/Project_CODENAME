package com.PROJECT_veterinary_simulation;

abstract class Animal {
    private final String birthDay;
    private final boolean registered;

    public Animal(String birthDay, boolean registered){
        this.birthDay = birthDay;
        this.registered = registered;
    }

    protected String getBirthDay() {
        return birthDay;
    }

    public boolean isRegistered() {
        return registered;
    }

    abstract void wInfo();

    @Override
    public String toString() {
        return "Birthday: " + birthDay + "  |  IsRegistered: " + registered;
    }
}