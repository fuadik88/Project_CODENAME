package com.conditional_statements;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(byte i=0; i<=6; i++){
            if (i==4)
                break;
            System.out.println("z " + i);
        }
        forOutside:
        for(byte a=0; a<5; a++){
            forInside:
            for (byte b=0; b<5; b++){
                System.out.println(a + " " + b);
                if(a==3 && b==4)
                    break forOutside;             //break - ends the loop, continue - pass the commands below it
            }

            }
        for(byte z=0; z<6; z++){
            if (z==3)
                continue;
            System.out.println("zzz " + z);
        }
    }
}
