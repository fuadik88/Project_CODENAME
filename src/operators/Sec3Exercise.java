package operators;

import java.util.Scanner;
import static java.lang.System.*;

public class Sec3Exercise {
    public static void main(String[] args) {
        //second to minute convert
  /*      Scanner secinput = new Scanner(System.in);
        System.out.println("Enter the number for converting");
        short sec = secinput.nextShort();
        System.out.println("Girdiginiz saniye = " + sec);
        System.out.println("Dakika olarak karsiligi = " + (sec/60) + " dakika ve " + (sec%60) + " saniyedir.");

        float fahrenheit = 100;
        float celsius = 5/9f * (fahrenheit - 32);
        out.println("Fahrenheit to Celsius is equal to: " + celsius);
*/
        short year = 4000;
        boolean isitexcessive = (year%400 == 0) || (year%4 == 0 && year%100 != 0 );
        out.println((isitexcessive == true) || false ? "Yil artik degil" : "Yil ARTIK !");

    }
}
