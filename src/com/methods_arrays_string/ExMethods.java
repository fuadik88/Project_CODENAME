package com.methods_arrays_string;

import java.util.Scanner;
import static java.lang.System.*;

public class ExMethods {                             //ArithmeticCalculations, each in one method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        for(;;){
            byte useroption = showMenu();
            if(useroption==0) break; else if (useroption<1 || useroption>5){
                out.println("Choose the option between 1-5"); continue;}
            out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            switch (useroption){
                case 1: out.println(sum(num1,num2)); break;
                case 2: out.println(subtract(num1,num2)); break;
                case 3: out.println(multiply(num1,num2)); break;
                case 4: out.println(power((int)num1,(int)num2)); break;
                case 5: out.println(sumOfDouble((int)num1,(int)num2));
            } //switch
        } //for loop
        out.println("Terminated");
    } //main

    private static double sumOfDouble(double x, int y) {
        return x+y;
    }

    private static int power(int x, int y) {
        return (int)Math.pow(x,y);
    }

    private static double multiply(double x, double y) {
        return (x*y);

    }

    private static double subtract(double x, double y) {
        return x-y;
    }

    private static double sum(double x, double y) {
        return x+y;
    }

    private static byte showMenu(){
        out.println("1. Sum");
        out.println("2. Subtract");
        out.println("3. Multiply");
        out.println("4. Power");
        out.println("5. SumofDouble ");
        Scanner sc = new Scanner(in);
        return sc.nextByte();
    }
}
