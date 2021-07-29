package com.inheritance;

public class JavaInheritance {
    public static void main(String[] args) {         //Inheritance => subclass which is derived from main category
                                                    // class, and involves all variables and methods of main class
        Shape asd = new Shape(10,20);
        System.out.println(asd.getWidth() + "   " +asd.getHeight());
        asd.calcArea();
        asd.calcCircumference();
        Rectangular rec1 = new Rectangular(30,50);
        rec1.wInfo();
        Square sq1 = new Square(15);
        sq1.wInfo();

    }
}

class Shape{
    private int width; private int height;

    public Shape(int cwidth, int cheight){
        width = cwidth; height = cheight;
    }

    public Shape(){
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void calcCircumference(){
        System.out.println("Circumference: " + (width+height)*2);
    }

    public void calcArea(){
        System.out.println("Area: " + getWidth()*getHeight());
    }

}

class Rectangular extends Shape{
    public Rectangular(int rwidth, int rheight){
        setWidth(rwidth); setHeight(rheight);
    }

    public Rectangular(int side){
        setWidth(side); //Constructor for Square class (All sides are equal)
    }

    public void wInfo(){
        System.out.println("Rectangular width: " + getWidth() + " and height: " + getHeight());
        calcArea();
        calcCircumference();
    }
}

class Square extends Rectangular{
    public Square(int side) {
        super(side);          //Super means parent class, which is Rectangular, determined by "extends"
        setHeight(side);
    }
}
