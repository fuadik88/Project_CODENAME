package operators;

import static java.lang.System.*;

public class LogicalOperators {
    public static void main(String[] args) {
        int s1 = 20, s2 = 21;
        out.println("is s1 equal to s2? " + (s1==s2));
        if(s1!=s2){
            s1++;
        }
        out.println("now it is equal" + (s1==s2));

        // boolean (TRUE - FALSE)  and = && , or = || , reverse = !variable
        byte myage = 21, herage = 25;
        float res = 0;
        if(myage>20 && herage<30){
            out.println("THIS IS CORRECT IF STATEMENT");
            res = (float)herage/myage;
        }
        out.println(res);
    }
}
