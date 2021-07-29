package com.polymorphism_and_binding;

public class BindingTypes {
    public static void main(String[] args) {
        TopClass tc = new TopClass();
        SubClass sc = new SubClass();
        wInfoo(tc);
        wInfoo(sc);
    }

    private static void wInfoo(TopClass cclass){
        cclass.wName();
    }
}

class TopClass{
    public void wName(){
        System.out.println("Print method of TopClass");
    }
}

class SubClass extends TopClass{
    public void wName(){
        System.out.println("Print method of SubClass");
    }

}

