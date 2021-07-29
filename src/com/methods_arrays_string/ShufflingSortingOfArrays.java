package com.methods_arrays_string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ShufflingSortingOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,5,7,6,2,3,4,11}, invertedNums = new int[nums.length];
        writeArray(nums);
        shuffle(nums);
        System.out.println();
        writeArray(nums);
        System.out.println();
        Arrays.sort(nums);
        writeArray(nums);
        System.out.println();
        for(int i=nums.length-1, j=0; i>=0; i--,j++){
            invertedNums[j] = nums[i];
        }
        writeArray(invertedNums);
        System.out.println();
        System.out.print("Type the number you want to search for: ");
        int input = sc.nextInt(); int res = Arrays.binarySearch(nums, input);
        if(res<0) System.out.println("There's no number you are looking for.");
        else System.out.println("The number you're looking for is " + (res+1) + ". number in the array");


    }
    private static void writeArray(int[] array){
        System.out.print("Index = ");
        for(int r : array) System.out.printf("%-3s", r);
    }
    private static void shuffle(int[] array){
        for(int i=array.length - 1; i>0; i--){
            int randomindex = (int)(Math.random() * (i+1));
            int temp = array[i];
            array[i] = array[randomindex];
            array[randomindex]= temp;
        }
    }
}
