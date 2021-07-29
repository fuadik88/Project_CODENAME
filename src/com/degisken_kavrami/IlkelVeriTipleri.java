package com.degisken_kavrami;

import static java.lang.System.*;
import java.util.Scanner;

public class IlkelVeriTipleri {
    public static void main(String[] args) {
        Scanner wait = new Scanner(in);

        int bytemin = Byte.MIN_VALUE, bytemax = Byte.MAX_VALUE;

        out.println("Min amount of byte is " + bytemin + ", and max amount of byte is " + bytemax);
        out.println("Min amount of byte is " + Integer.MIN_VALUE + ", and max amount of byte is " + Integer.MAX_VALUE);
        out.println("Min amount of byte is " + Short.MIN_VALUE + ", and max amount of byte is " + Short.MAX_VALUE);
        out.println("Sizes are " + Float.SIZE + Float.SIZE + Float.SIZE + " in order");
        out.println("Sizes are " + Double.SIZE + Double.SIZE + Double.SIZE + " in order");
        out.printf("Sizes are %s, %s, %s in order\n", Double.SIZE, Float.SIZE, Short.SIZE);

        //char
        char akk = '5';
        out.println("senin dedigin ak " + akk + "-tir");

        //boolean (true:false)
        boolean result = true;
        out.println(result);
        wait.nextLine();

    }
}
