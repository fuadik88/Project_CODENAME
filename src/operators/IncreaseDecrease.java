package operators;
import static java.lang.System.*;

public class IncreaseDecrease {
    public static void main(String[] args) {
        short s1 = 10;
        short s2 = ++s1, s3 = s1--;
        out.printf("%s %s %s\n", s1, s2, s3);
        --s2; s3++;
        out.println(s1 + s2);
        out.println(s1 + " " + s2 + " " + s3);
        s1 = (short) (s1 +1);
        out.println(s1);

    }
}
