package com.OOP;

public class Ex1Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle(15);
        System.out.println("Area is: " + c1.cArea());
        System.out.println("Circumference is: " + c1.cCircumference());
        System.out.println("Radius = " + radius(c1));


    }
    private static double radius(Circle c){
        return c.cCircumference() / (2*3.14);
    }
}

class Circle{
    private final int radius;
    private static final double PI = 3.14;

    public Circle(int radius){
        this.radius = radius;
    }
    public double cCircumference(){
        return 2*PI*radius;
    }

    public double cArea(){
        return PI * Math.pow(radius,2);
    }

}
