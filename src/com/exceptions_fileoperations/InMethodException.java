package com.exceptions_fileoperations;

public class InMethodException {
    public static void main(String[] args) {
        try{ cException();}
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array Exception: " + ae);
        }
    }

    private static void cException(){
        String[] str = {"Asd", "bef", "322", null, "Sat"};
        for (int i = 0; i < str.length + 1; i++) {
            try {
                int num = str[i].length()+3 + Integer.parseInt(str[i]);
                System.out.println(num);
            } catch (NumberFormatException | NullPointerException ne) {
                System.out.println("Error: " + ne);
            }
        }
    }
}
