package com.methods_arrays_string;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {        //Sum of 2D Array with random elements.
        int[][] matris = new int[3][2];
        for(int row=0; row<matris.length; row++)
            for(int column=0; column<matris[row].length; column++)
                matris[row][column] = (int)(Math.random()*19+1);
            wArray(matris);
        System.out.println("Sum of elements = " + sumArray(matris));
    }

    private static void wArray(int[][] array){
        for(int[] r : array) System.out.println(Arrays.toString(r));
    }

    private static int sumArray(int[][] array){
        int sum = 0;
        for (int[] r : array)
            for (int i : r)  sum += i;

        return sum;
    }
}
