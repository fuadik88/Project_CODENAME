package com.methods_arrays_string;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {            //5x5 matris, capraz toplam.
        int[][] matris = new int[5][5]; int xsum = 0;
        for(int row=0; row<matris.length; row++){
            for(int column=0; column<matris[row].length; column++)
                matris[row][column] = (int)(Math.random() * 10);
            xsum += matris[row][row];
        }
        for(int[] r : matris) System.out.println(Arrays.toString(r));
        System.out.println("XSUM = " + xsum);
    }
}
