package com.methods_arrays_string;

import static java.lang.System.*;

public class MethodKeptInVariable {
    public static void main(String[] args) {
        int random = 1;
        while(random<10){
            int n = getNum();
            out.println(random + " * " + n + " = " + (random * n));  //multiplying variable with random numbers (method)
            random++;
        }
    }

    private static int getNum() {
        return (int) (Math.random() * 20 + 1);
    }

}
