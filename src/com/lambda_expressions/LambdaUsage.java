package com.lambda_expressions;

import java.util.*;

public class LambdaUsage {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        new Thread(() -> {
            Thread.currentThread().setName("custom-1");
            System.out.println("Custom thread: " + Thread.currentThread().getName());
        }).start();

        ArrayList<String> asd = new ArrayList<>();
        asd.add("fng");
        asd.add("zeurng");
        asd.add("yjwkd");
        asd.add("asdfmksv");
        asd.add("lertmke");
        System.out.println(asd);

        new Thread(() -> System.out.println("Runnable thread:" + Thread.currentThread().getName())).start();
        asd.sort((o1, o2) -> CharSequence.compare(o1,o2));
        System.out.println(asd);

        String go = "FUAD IMANOV";
        List<String> reverse = Arrays.asList(go.split(""));
        Collections.reverse(reverse);
        StringBuilder reversed = new StringBuilder();
        for(String r : reverse)
            reversed.append(r);
        System.out.println(reversed);

        String dot = "Fuad Imanov GO LTD";

        new Thread(() -> {
            String[] dotArray = dot.split(" ");
            for(String r : dotArray)
                System.out.print(r +  " | ");
        }).start();
    }
}
