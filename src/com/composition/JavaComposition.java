package com.composition;

public class JavaComposition {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.startCar();
        car1.stopCar();
        car1.wCarInfo();
    }
}

class Car{
    private Engine /*<=Class*/ carEngine;
    private String color; private String vendor; private int prodDate;

    public Car(){
        carEngine = new Engine();
        color = "Matte Black"; vendor = "Cadillac"; prodDate = 2021;
    }

    public void startCar(){
        carEngine.start();
        System.out.println("Car is ready to move");
    }

    public void stopCar(){
        carEngine.stop();
        System.out.println("Car turned off");
    }

    public void wCarInfo(){
        System.out.printf("%-10s\n%-10s %-3s %-10s",  carEngine.engineInfo(), color, prodDate, vendor);
    }
}

class Engine{
    private final String manufacturer;
    private final int horsepower;

    public Engine(){
        manufacturer = "BMW";
        horsepower = 420;
    }

    public void start(){
        System.out.println("Engine started!");
    }

    public void stop(){
        System.out.println("Engine stopped!");
    }

    public String engineInfo(){
        return manufacturer + "  " + horsepower + "HP";
    }
}
