package com.degisken_kavrami;

public class tipconvertTypecasting {
    public static void main(String[] args) {
        int num = 10; double num2 = 7.76;
        num2=num;
        System.out.println("num2 is equal to " + num2);

        num = (int) num2;
        System.out.println("num is " + num);

    }
}
