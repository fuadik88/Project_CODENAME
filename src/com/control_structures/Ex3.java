package com.control_structures;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) { //sum the range of min-max
        Scanner sc = new Scanner(System.in);
        int sum=0, min, max;
        min = sc.nextInt(); max = sc.nextInt();
        for(int i=min+1; i<max; i++){
            sum = sum + i;
            System.out.printf("%s, ", i);
        }
        System.out.println("\n" + sum);
    }
}
