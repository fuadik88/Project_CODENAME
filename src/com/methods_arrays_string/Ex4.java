package com.methods_arrays_string;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {                //Integer to Binary
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Decimal = " + input + ". Binary = " + Integer.toBinaryString(input) + ".");
    }
}
