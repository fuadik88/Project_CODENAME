package com.inner_classes;

public class AnonymousNestedClass {
    public static void main(String[] args) {
        Regulator reg = new Regulator();
        System.out.println(reg.sum(4,12));
        newCalculator calc = new newCalculator();
        System.out.println(calc.sum(4,6));
        //      //       //         //
        Regulator reg1 = new Regulator(){
            @Override
            public int sum(int i, int j) {
                System.out.println("Anonymous SUM:");
                return super.sum(i, j);
            }
        };

        System.out.println(reg1.sum(77,52));


    }
}

class newCalculator extends Regulator{
    @Override
    public int sum(int i, int j) {
        System.out.println("SUM:");
        return super.sum(i, j);
    }
}
