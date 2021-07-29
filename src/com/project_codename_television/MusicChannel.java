package com.project_codename_television;

public class MusicChannel extends Channels{
    private final String genre;
    public MusicChannel(int chNo, String chName, String genre) {
        super(chNo, chName);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return getChNo() + " " + getChName() + " " + genre;
    }
}
