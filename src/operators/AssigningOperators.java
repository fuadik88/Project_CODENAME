package operators;

import static java.lang.System.*;

public class AssigningOperators {
    public static void main(String[] args) {
        int s1 = 24, s2 = 32;
        float result = 0;
        result += s1;
        out.println(result);
        result -= s2;
        out.println(result);
        result *= s1;
        out.println(result);
        result /= s2;
        out.println(result);
        result %= s1;
        out.println(result);

        int s11 = 15, s22 = 30;
        float res = 57;
        out.println((res/=s22) + "\n");

        double ondalikliSayi = 7.5, odevSonucu = 1;
        ondalikliSayi *= ++odevSonucu;
        out.println(odevSonucu + " " + ondalikliSayi);

        short s3 = 10, s4 = 6;
        s3++; --s4;
        out.printf("%s and %s\n", s3, s4);
        s3 *= --s4;
        out.printf("S3 is %s and S4 is %s\n", s3, s4);
    }
}
