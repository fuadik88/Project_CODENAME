package com.conditional_statements;

import static java.lang.System.*;

public class IfElseSwitch {
    public static void main(String[] args) {
        byte s1 = 9, s2 = 9;
        if (s1 > s2) {
            out.println(s1 + ">" + s2);
        }
        else if (s1 < s2)
            out.println(s1 + "<" + s2);
        else {
            out.println(s1 + "=" + s2);
            out.println("program terminated");
        }
        out.println(s1>s2 ? s1 + ">" + s2 : s1<s2 ? s1 + "<" + s2 : s1 + "=" + s2); //short if-else

        // switch
        byte dayofweek = 4;
        switch (dayofweek){
            case 1: out.println("Monday");    break;
            case 2: out.println("Tuesday");   break;
            case 3: out.println("Wednesday"); break;
            case 4: out.println("Thursday");  break;
            case 5: out.println("Friday");    break;
            case 6: out.println("Saturday");  break;
            case 7: out.println("Sunday");    break;
            default: out.println("incorrect day!");
        }
        byte p=0;
        while (p<8){
            out.println("asdfgh " + p);
            p++;
        }
    }
}
