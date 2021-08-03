package com.exceptions_fileoperations;

public class MultiCatch {
    public static void main(String[] args) {
        String[] str = {"Asd", "bef", "322", null, "Sat"};
        for (int i = 0; i < str.length + 1; i++) {
            try {
                int num = str[i].length() + Integer.parseInt(str[i]);
                System.out.println(num);
            } catch (NumberFormatException ne) {
                System.out.println("Error: " + ne);
            } catch (NullPointerException e) {
                System.out.println("Error: " + e);
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Error: " + ae);
            }
        }
        System.out.println("\nEND\n");

        for (int i = 0; i < str.length + 1; i++) {
            try {
                int num = str[i].length() + Integer.parseInt(str[i]);
                System.out.println(num);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
