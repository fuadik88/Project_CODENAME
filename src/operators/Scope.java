package operators;

public class Scope {
    public static void main(String[] args) {
        int s1 = 1;{
            System.out.println(s1);
            int s2 = 13;{
                System.out.println(s2);
            }
            System.out.println(s2);
        }
    }
}
