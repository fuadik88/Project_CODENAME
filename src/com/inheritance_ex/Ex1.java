package com.inheritance_ex;

public class Ex1 {
    public static void main(String[] args) {
        A sjs = new B();
        sjs.akk();
    }
}

class A{
    int i=30;
    public void akk(){
        System.out.println("A class");
    }
}
class B extends A{
    int a=50;
    public void akk(){
        System.out.println("B class");
    }
}