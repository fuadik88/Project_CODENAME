package com.control_structures;

import java.util.Scanner;
import static java.lang.System.*;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        byte random = (byte) (Math.random() * 20 + 1);
        out.println("Random: " + random);
        out.println("Enter the number: ");
        byte guess = -1;
        byte count = 0;
        while (guess != random) {
            guess = sc.nextByte();
            count++;
            if (guess == 0){out.println("Terminated!"); exit(0);}
            if (guess < random) out.println("increase (enter 0 to exit)...");
            else out.println("decrease (enter 0 to exit)...");
        }
        out.println("Congrats, tries: " + count);
    }
}
