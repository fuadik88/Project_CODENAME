package com.string_class;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String id = "fuadmonsoon";

        System.out.println(id.length());
        System.out.println(id.charAt(5));
        System.out.println(id.concat(" 88"));     //String id doesn't change...
        System.out.println(id.toUpperCase(Locale.ROOT));
        System.out.println(id.toLowerCase(Locale.ROOT));

        String locale = "NY";
        String locale2 = "OH";
        System.out.println(locale.equals(locale2));
        System.out.println(locale.equalsIgnoreCase(locale2)); //Ignores Case Sensitivity

        System.out.println(locale.compareTo(locale2));
        System.out.println(locale.startsWith("N"));  //String starts with that char or not?
        System.out.println(locale2.endsWith("M"));

        System.out.println(id.contains("dmo")); //fuaDMOnsoon
        System.out.println(id.contains("md"));

        System.out.println(id.trim().substring(4,11)); // 2 methods back to back...
        System.out.println(id.indexOf("n"));
        System.out.println(id.lastIndexOf("n")); //Which index was it used last time in?
    }
}
