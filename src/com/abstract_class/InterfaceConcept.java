package com.abstract_class;

import java.util.Scanner;

public class InterfaceConcept {
    public static void main(String[] args) {
        Doable d1 = new Kick();

    }
}

interface Doable{
    void doatype();
}

class Kick implements Doable{

    void lowKick(){

    }

    @Override
    public void doatype() {

    }
}
