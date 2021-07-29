package com.control_structures;

import static java.lang.System.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {      //find factorial
        byte num;
        Scanner sc = new Scanner(System.in);
        out.println("Enter the number: ");
        for(;;) {
            int factorial = 1;
            num = sc.nextByte();
            if (num == 0) break;
            for (byte i = 1; i <= num; i++) {
                factorial *= i;
            }
            out.println("Result: " + factorial);
            out.println("Enter 0 to exit... ");
        }
        out.println("Terminated!");
        }
    }
