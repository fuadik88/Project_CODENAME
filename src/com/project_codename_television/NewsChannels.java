package com.project_codename_television;

public class NewsChannels extends Channels{
    private final String newsType;
    public NewsChannels(int chNo, String chName, String newsType) {
        super(chNo, chName);
        this.newsType = newsType;
    }

    @Override
    public String toString() {
        return getChNo() + " " + getChName() + " " + newsType;
    }
}
