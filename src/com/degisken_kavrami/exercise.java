package com.degisken_kavrami;

public class exercise {
    public static void main(String[] args) {

        String stringSayi = "150";
        int convertedsayi = Integer.parseInt(stringSayi); // or valueOf
        System.out.println("Converted string is " + convertedsayi);
        convertedsayi = 151;
        String converteds = String.valueOf(convertedsayi);
        System.out.printf("the sayi: %s\n", converteds);

        System.out.println(1 - 0.7);
        System.out.println(1.0 - 0.6 + "\n\n");

        int sayi1 = 15;
        int sayi2 = 20;
        double avg =( sayi1 + sayi2) / 2;
        System.out.println("average is " + avg);

        int sayii1 = 15;
        int sayii2 = 20;
        double avg2 = (sayii1 + sayii2) / 2d;
        System.out.println("Average is " + avg2);

        int sayii12 = 15;
        int sayii22 = 20;
        double avg3 = (double) (sayii12 + sayii22) / 2;
        System.out.println("Average is " + avg3);



    }

}
