package com.methods_arrays_string;

import static java.lang.System.*;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        showMenu();
        sum(5,10);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        changeNumber(50);
        out.println("Subtraction = " + subtractNums(n1,n2));

    }

    private static int subtractNums(int n1, int n2) {
        return (n1-n2);
    }

    private static void changeNumber(int x) {
        Scanner sc = new Scanner(in);
        x = x + sc.nextInt();
        out.println("Changed number is: " + x);
    }

    public static void showMenu(){
        out.println("Sum");
        out.println("Subtract");
        out.println("Multiply");
        out.println("Divide");
    }
    public static void sum(int n1, int n2){
        out.println("Sum = " + (n1+n2));

    }
}