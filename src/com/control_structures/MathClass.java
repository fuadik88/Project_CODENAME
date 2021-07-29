package com.control_structures;

import static java.lang.System.*;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        int i = (int) Math.PI;
        out.println("Pi number " + Math.PI);
        out.println(i);
        out.println("4^3 " + (int) Math.pow(4,3)); // added int to remove .0 (float, double)
        out.println("3^4 " + Math.pow(3,4));



        /*               MY ADVANCED COMPARISON                */
        Scanner gir = new Scanner(System.in);
        short num1, num2; byte count;
        out.println("how many times to play?");
        count = gir.nextByte();
        out.println("enter the numbers");
            while (count>0){
                num1 = gir.nextShort();
                num2 = gir.nextShort();
                if (num1 > num2) {
                    out.println(num1 + ">" + num2);
                } else if (num1 < num2)
                    out.println(num1 + "<" + num2);
                else out.println(num1 + "=" + num2);
                count--;
                if (count>0)
                    out.println(count + " rounds left...");
                else out.println("THE END!");
            }
        }
    }