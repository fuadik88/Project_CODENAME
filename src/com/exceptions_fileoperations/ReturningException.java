package com.exceptions_fileoperations;

public class ReturningException {
    public static void main(String[] args) {
        System.out.println(returnValue());
    }

    private static String returnValue() {
        String str = "Salute ";

        try {
            str += "try";
            ClassNotFoundException ce = new ClassNotFoundException();
            throw ce; //throw sends object to catch. Or |throw new ClassNotFoundException();
        } catch (Exception e) {
            str += " catch";
        } finally {
            str += " finally";
            return str;
        }
    }
}
