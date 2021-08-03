package com.exceptions_fileoperations;

public class ThrowsUsage {
    public static void main(String[] args) {
        try {
            method3();
        } catch (NumberFormatException ne) {
            System.out.println(ne);
        }
    }


    private static void method() throws NumberFormatException {
        int i = Integer.parseInt("sjs");
    }

    private static void method2() throws NumberFormatException {
        method();
    }

    private static void method3() throws NumberFormatException {
        method2();
    }
}

class A{
    void methodA() throws ClassNotFoundException {
        System.out.println("A method");
    }
}

class B extends A{
    @Override
    void methodA() throws ArrayIndexOutOfBoundsException, ClassNotFoundException {
        System.out.println("B method");
    }
}

class C extends B{
    @Override
    void methodA() throws ArrayIndexOutOfBoundsException, ClassCastException, ClassNotFoundException {
        System.out.println("C method");
    }
}