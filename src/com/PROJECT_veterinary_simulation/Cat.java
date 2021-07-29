package com.PROJECT_veterinary_simulation;

class Cat extends Animal{
    String breed;

    public Cat(String birthDay, boolean registered, String breed) {
        super(birthDay, registered);
        this.breed = breed;
    }

    @Override
    void wInfo() {
        System.out.println("Cat " + toString() + "  |  Is registered: " + isRegistered() +
                "  |  Birthday: " + getBirthDay());
    }

    @Override
    public String toString() {
        return super.toString() +  "  |  Breed: " + breed;
    }
}
