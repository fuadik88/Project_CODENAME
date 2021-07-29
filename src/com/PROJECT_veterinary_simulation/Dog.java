package com.PROJECT_veterinary_simulation;

class Dog extends Animal{
    int vaccineAmount;

    public Dog(String birthDay, boolean registered, int vaccineAmount) {
        super(birthDay, registered);
        this.vaccineAmount = vaccineAmount;
    }

    @Override
    void wInfo() {
        System.out.println(toString() + "  |  Is registered: " + isRegistered() +
                "  |  Birthday: " + getBirthDay() );
    }


    @Override
    public String toString() {
        return super.toString() +  "  |  Injected vaccine count: " + vaccineAmount;
    }
}
