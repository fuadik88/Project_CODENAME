package com.methods_arrays_string;

import static java.lang.System.*;

public class Ex1 {
    public static void main(String[] args){ //Find an average of Array and the amount of elements below the average
        int[] array = new int[100];
        for(byte index=0; index<array.length; index++) array[index] = (int)(Math.random()*99+1);
        writeArray(array);
        out.println();
        findAverage(array);
    }
    private static void writeArray(int[] array){
        for(int r : array) out.printf("%-3s", r);
    }
    private static void findAverage(int[] array){
        int sum = 0; float average; int amofblwavg=0;
        for(int r : array) sum += r;
        average = (float)sum/array.length;
        out.println("Average = " + average);
        for(int r : array) if(r < average) amofblwavg++;
        out.println("Amount of elements below average = " + amofblwavg);
    }
}
