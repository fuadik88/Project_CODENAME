package com.abstract_class;

public class AbstractClassConcept {
    public static void main(String[] args) {
        Shape sh1 = new Circle(10);
        Shape sh2 = new Square(15);
    }
}
abstract class Shape{                   //We don't/can't make an object of abstract class.
    private int side1;
    private float calculation;

    abstract public void calcCircumference();
    abstract public void calcArea();

    public int getSide(){
        return side1;
    }

    public void setSide(int side) {
        this.side1 = side;
    }
}

class Square extends Shape{
    public Square(int side){
        setSide(side);
    }

    @Override
    public void calcCircumference() {
        System.out.println("Circumference of Square: " + (getSide()*4));
    }

    @Override
    public void calcArea() {
        System.out.println("Area of Square: " + Math.pow(getSide(),2));
    }
}

class Rectangular extends Shape{
    private int side2;

    public Rectangular(int side1, int side2){
        setSide(side1);
        this.side2 = side2;
    }

    @Override
    public void calcCircumference() {
        System.out.println("Circumference of Rectangular: " + (getSide()+side2)*2);
    }

    @Override
    public void calcArea() {
        System.out.println("Area of Rectangular: " + getSide()*side2);
    }
}

class Circle extends Shape{
    public Circle(int radius){
        setSide(radius);
    }

    @Override
    public void calcCircumference() {
        System.out.println("Circumference of Circle: " + (float)(2*3.14*getSide()));
    }

    @Override
    public void calcArea() {
        System.out.println("Area of Circle: " + (3.14*Math.pow(getSide(),2)));
    }
}
