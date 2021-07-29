package com.methods_arrays_string;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] array = {4,5,6,8,7,11};
        int[] copyarray = new int[array.length];
        System.out.println(copyarray[0]);
        System.arraycopy(array,0,copyarray,0,array.length);
        System.out.println(copyarray[0]);
        for(int r : copyarray) System.out.printf("%-2s", r);
        int[] invertedArray = inverseArray(array);
        System.out.println();
        for(int r : invertedArray) System.out.printf("%-3s", r);
    }
    private static int[] inverseArray(int[] array) {
        int[] inverse = new int[array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            inverse[j] = array[i];
        }
        return inverse;
    }
}
