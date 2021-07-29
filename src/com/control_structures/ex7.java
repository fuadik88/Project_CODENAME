package com.control_structures;

import java.util.Scanner;
import static java.lang.System.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Enter a word: ");
        String word = sc.nextLine();
        byte first=0, last=(byte)(word.length() - 1); // -1 because of index starts from 0.

        while (first < last) {
            if (word.charAt(first)!=word.charAt(last)) {out.println("the word is not polindrome."); exit(0);}
            first++; last--;
        }
        out.println("The word is polindrome.");
    }
}
