package com.exceptions_fileoperations;

public class ExceptionUsage {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("Convert");
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            String[] sjs = {"sda", "fsfs", "au"};
            System.out.println(sjs[3]);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        try {
            Object o = new Object();
            String s = (String) o;
        } catch (ClassCastException ce) {
            System.out.println("Error: " + ce);
        } finally {
            System.out.println("Finally Progressing...");
        }



        System.out.println("\nProgressing...");
    }
}
