package com.conditional_statements;

import static java.lang.System.*;

public class ForWhileLoop {
    public static void main(String[] args) {
        for(byte i=0; i<10; i= (byte)(i+3))
            out.println("a" + i);

        for(byte i=0, j=0; i+j<10; i++, j++)
            out.println(i+j);

        byte i=0;
        while (i<8){
            out.println("asdfgh" + i);
            i++;
        }
        for(byte p=0; p<8; p++)
            out.println(p);

        byte p = 0;
        do {
            out.println(p);
            p++;
        }while (p<5);
    }
}
