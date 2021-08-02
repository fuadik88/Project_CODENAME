package com.PROJECT_udemy_player;

abstract class User {
    private final String name;
    private final String intro;
    private final String uname;

    public User(String name, String intro, String uname){
        this.name = name;
        this.intro = intro;
        this.uname = uname;
    }

    public String getName() {
        return name;
    }

    public String getIntro() {
        return intro;
    }

    public String getUname() {
        return uname;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Username: " + uname + " | Introduction: " + intro;
    }
}
