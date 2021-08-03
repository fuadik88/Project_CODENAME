package com.exceptions_fileoperations;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age...");

        try {
            String input = sc.nextLine();
            int age = Integer.parseInt(input);
            if (age < 0 || age > 110) {
                throw new InvalidAgeException();
            }
        } catch (InvalidAgeException ie) {
            System.out.println(ie);
        } catch (NumberFormatException ne){
            System.out.println("You should enter number!");
        }
    }
}

class InvalidAgeException extends Exception {
    String errMessage= "Invalid Age!";

    @Override
    public String toString() {
        return errMessage;
    }
}
