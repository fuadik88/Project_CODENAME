package com.methods_arrays_string;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {     //Arrays.toString to print 2D Arrays with foreach loop
        //2x3 Array, Row x Column
        int[][] mdarray = {{1,2,3}, {4,5,6}, {7,8,9}}; int[][] tdarray = new int[3][4];
        for(int[] i : mdarray) System.out.println(Arrays.toString(i));
        createArray(tdarray);
        for(int[] r : tdarray) System.out.println(Arrays.toString(r));
    }

    private static void createArray(int[][] tdarray){
        Scanner sc = new Scanner(System.in);
        for(int row=0; row<tdarray.length; row++){
            for(int column=0; column<tdarray[row].length; column++)
                tdarray[row][column] = sc.nextInt();
        }
    }
}
