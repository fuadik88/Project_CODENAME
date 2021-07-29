package com.control_structures;

import java.util.Scanner;
import static java.lang.System.out;

public class Sec4Exercise {
    public static void main(String[] args) {
        //Ex1
         short height; float weight, index;
        Scanner sc = new Scanner(System.in);

        out.println("Welcome to BMI app\n Please enter your height in cm...");
        height = sc.nextShort();
        out.println("Please enter your weight...");
        weight = sc.nextFloat();
        sc.nextLine();
        out.println("Your body parameters are: " + height + " and " + weight + ".");
        index = weight / (float)(Math.pow(height/100f,2));
        out.println("Press enter to proceed...");
        sc.nextLine();
        out.println("Your BMI is: " + index + ".");
        out.println(index<15 ? "Extremely skinny" : index>15 && index<16 ? "Skinny" : index>16 && index<25 ?
                "Healthy" : index>25 && index<40 ? "Fatty" : "Obese");

        //Ex2
        short random, input;
        Scanner scc = new Scanner(System.in);

        do {    //with do-while
            random = (short)(Math.random() * 20 + 1);
            out.println("Random number is: " + random);
            out.println("Enter your guess below:");
            input = scc.nextShort();

        } while (input!=random);
        out.println("Congrats!");


        short i=0;
        while(i==0){  //with while
            random = (short)(Math.random() * 20 + 1);
            out.println("Random number is: " + random);
            out.println("Enter your guess below:");
            input = scc.nextShort();
            scc.nextLine();
            if(input==random){
                out.println("Congrats!");
                break;
            } else if(input==0) break;
        }
        out.println("2nd loop Terminated");


        int ii = 544;
        int digit = Character.getNumericValue(String.valueOf(ii).charAt(2)); //String.valueOf().charAt() returns
        // the ASCII coded digit of the number, Character.getNumericValue converts the char to int without ASCII.
        out.println(digit);
        out.println(ii+digit);
    }
}
