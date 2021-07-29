package com.methods_arrays_string;

import java.util.Scanner;
import static java.lang.System.*;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        byte input = sc.nextByte();
        int[] array = new int[input];
        int sum = 0;
        for(byte index=0; index<input; index++){
            out.print("Enter the number>>> ");
            array[index] = sc.nextInt();
            sum = sum + array[index];
        }
        out.println("Sum of numbers is " + sum);
    }
}
