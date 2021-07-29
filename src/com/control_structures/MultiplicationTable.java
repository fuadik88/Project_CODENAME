package com.control_structures;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int left=1; left<=10; left++){
            for(int right = 1; right<=10; right++){
                System.out.print(left + "x" + right + " = " + (left*right) + "   ");
            }
            System.out.println("\n");
        }
    }
}
