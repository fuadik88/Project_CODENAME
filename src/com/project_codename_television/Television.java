package com.project_codename_television;

/* In this PROJECT =>
---  Composition      implemented
---  Encapsulation    implemented
---  Immutability     implemented
---  Final            implemented
---  Polymorphism     implemented.  */

import java.util.Scanner;
import static java.lang.System.*;

public class Television {
    public static TVsetup tv;
    static Scanner sc = new Scanner(in);
    public static void main(String[] args) {

        boolean exit = false;
        showMenu();
        while(!exit){
            out.println("Choose the option: (Press m to show menu)");
            String inp = sc.next();

            switch (inp){
                case "m": showMenu(); break;
                case "0": exit=true; break;
                case "1": setupTV(); break;
                case "2": if(tv==null) out.println("First setup the TV!"); else tv.turnOn(); break;
                case "3": if(tv==null) out.println("First setup the TV!"); else tv.volumeUP(); break;
                case "4": if(tv==null) out.println("First setup the TV!"); else tv.volumeDOWN(); break;
                case "5": if(tv==null) out.println("First setup the TV!"); else tv.setChannel(sc.nextInt()); break;
                case "6":
                    break;
                case "7": if(tv==null) out.println("First setup the TV!"); else tv.turnOff(); break;
                default: out.println("Choose the given options!");
            }
        }
    }

    private static void setupTV() {
        if(tv == null){
            sc.nextLine();
            out.println("Enter the TV Brand:");
            String brand = sc.next();
            out.println("Choose the TV size:");
            String size = sc.next();
            tv = new TVsetup(brand,size);
        } else out.println("You already setup the TV\n" + tv);
    }

    private static void showMenu(){
        System.out.println("************   MENU   ************\n");
        System.out.println("0 -- Quit\n" +
                "1 --- Setup the TV\n" +
                "2 --- Turn on the TV\n" +
                "3 --- Volume UP\n" +
                "4 --- Volume DOWN\n" +
                "5 --- Change the Channel\n" +
                "6 --- Channel INFO\n" +
                "7 --- Turn off the TV\n" +
                "m --- showMenu\n");
    }
}
