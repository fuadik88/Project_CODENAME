package com.project_codename_television;

public class Channels {
    private final String chName; private final int chNo;

    public Channels(int chNo, String chName){
        this.chNo = chNo; this.chName = chName;
    }

    public String getChName() {
        return chName;
    }

    public int getChNo() {
        return chNo;
    }

    @Override
    public String toString() {
        return "Channels{" +
                "chName='" + chName + '\'' +
                ", chNo=" + chNo +
                '}';
    }
}
