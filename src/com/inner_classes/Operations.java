package com.inner_classes;

import java.util.Scanner;

public class Operations {
    private int ii;
    public void sum(int i, int j){
        Scanner sc = new Scanner(System.in);
        sum sum = new sum();
        System.out.println("Sum or doubleSum? (enter 1 or 2)");
        byte input = sc.nextByte();
        if(input==1) ii = sum.sum(i,j);
        else if(input==2) ii = sum.doubleSum(i,j);
        System.out.println("Result: " + ii);
    }


    private static class sum{
        public int sum(int i, int j){
            return i+j;
        }

        public int doubleSum(int i, int j){
            return 2*(i+j);
        }
    }

    private static class subtract{
        public int subtract(int i, int j){
            return i-j;
        }
    }

    private static class multiply{
        public int multiply(int i, int j){
            return i*j;
        }
    }

    private static class divide{
        public String divide(int i, int j){
            if(j!=0) return String.valueOf(i/j);
            else return "!!!";
        }
    }

}
