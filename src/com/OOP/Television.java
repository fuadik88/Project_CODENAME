package com.OOP;

public class Television {
     private int channel = 1; private int volumeLevel; private boolean ON;

     public void setChannel(int achannel){
         if(ON) channel = achannel; else System.out.println("First turn On the TV!");
     }
     public static String tvDiode = "ELECTRODE"; //static variable or method makes it for the whole class,
                                                // not only for objects. EX. static => Television.tvDiode class.Variable
                                               // not static => sony.tvDiode(method) object.Variable.
     public void setVolumeLevel(int avolumeLevel) {
        if(ON) {volumeLevel = avolumeLevel;
            System.out.println("Volume set to " + avolumeLevel);}
        else System.out.println("First turn On the TV!");
     }

     public void turnOn(){
         if(!ON) {System.out.println("TV is turning ON");
         ON = true;}
         else System.out.println("TV is already running!");
     }
     public void turnOff(){
        if(ON) {System.out.println("TV turned off!");
        ON = false;}
        else System.out.println("TV is already OFF!");
     }
     public void status(){
        if(ON) System.out.println("TV is running\nCurrent channel: " + channel + "\nVolume: " + volumeLevel);
        else System.out.println("TV is OFF!");
     }
}
