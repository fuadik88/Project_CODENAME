package com.methods_arrays_string;


import java.util.Scanner;

public class ArraysInMethods {
    public static void main(String[] args) {
        int[] numbers = {1,5,34,7,8}; int[] inputs = new int[10];
        showArray(numbers);
        showArray(numbers);
        calcTheSum(inputs);
    }

    private static void calcTheSum(int... inputs) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(byte index=0; index<10; index++ ){
            int userinput = sc.nextInt();
            inputs[index] = userinput;
            if(userinput==0) break;
            sum += inputs[index];
        }
        System.out.println("Sum of nums = " + sum);
    }

    private static void calcTheSum(int i, int j) {
        int sum = i+j;
        System.out.println("Sum> " + sum);
    }

    private static void incrementValueOfArray(int[] numbers) {
        for(byte index=0; index<numbers.length; index++)
            numbers[index]++;
    }

    private static void showArray(int[] numbers) {
        for(int read : numbers)
            System.out.print("Nums> " + read + ". ");
    }
}
