package com.project_codename_television;

import java.util.ArrayList;

public class TVsetup {
    private boolean isrunning;
    private final String brand; private final String size;
    private final ArrayList<Channels> channelList;
    private byte volume=5;
    private int currentCh=1;

    public TVsetup(String brand, String size){
        this.brand = brand; this.size = size;
        channelList = new ArrayList<>();
        makeupChannels();
    }

    private void makeupChannels() {
        NewsChannels news = new NewsChannels(1,"NTV", "Politics");
        channelList.add(news);
        MusicChannel music = new MusicChannel(2, "Dream TV", "Pop");
        channelList.add(music);
    }

    public void turnOn(){
        if(!isrunning){
            System.out.println("TV is turned ON");
            isrunning = true;
        } else System.out.println("TV is already ON");
    }

    public void turnOff(){
        if(isrunning){
            System.out.println("TV is turned OFF");
            isrunning = false;
        } else System.out.println("TV is already OFF");
    }

    public void setChannel(int input){
        if(isrunning) this.currentCh = input;
        else System.out.println("First turn ON the TV!");
    }

    public void volumeUP(){
        if(isrunning){
            if(volume<20){ volume++;
            System.out.println("Volume: " + volume); }
            else System.out.println("Volume is at MAX level!"); }
        else System.out.println("First turn ON the TV!");
    }

    public void volumeDOWN(){
        if(isrunning){
            if(volume>0){ volume--;
                System.out.println("Volume: " + volume);}
            else System.out.println("Volume is at MIN level!"); }
        else System.out.println("First turn ON the TV!");
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "  |  Size: " + size;
    }
}
