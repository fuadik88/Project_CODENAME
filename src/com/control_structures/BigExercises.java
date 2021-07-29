package com.control_structures;

import static java.lang.System.*;
import java.util.Scanner;

public class BigExercises {
    public static void main(String[] args) {
        //Find the average of numbers
        Scanner sc = new Scanner(System.in);
        float sum=0, num, count=0;
        while (count >= 0) {
            out.println("enter the number: (Enter 0 to exit)");
            num = sc.nextInt();
            sum = sum + num;
            if (num == 0) break;
            out.println("sum of numbers: " + sum);
            count++;
        }
        out.println("Sum of the numbers is " + sum + " and the average of them is " + sum/count);
        out.println("Terminated!");

        // print 1-100
        for (byte i = 1; i<=100; i++){
            if(i==100){
                out.printf("%s.", i);
                break; }
            out.printf("%s, ", i);
        }
        //print 1-100 2nd version
        out.println();
        for (byte i=1; i<=100; i++){
            if(i!=100) out.printf("%s, ", i);
            else out.printf("%s.", i);
        }
    }

}

