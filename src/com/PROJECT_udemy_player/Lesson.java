package com.PROJECT_udemy_player;

public class Lesson {
    private final int no;
    private final String topic;
    private final double duration;

    public Lesson(int no, String topic, double duration) {
        this.no = no;
        this.topic = topic;
        this.duration = duration;
    }

    public double getDuration(){
        return duration;
    }

    public String getTopic(){
        return topic;
    }

    @Override
    public String toString() {
        return "Lesson N#: " + no + " | Topic: " + topic + " | Duration: " + duration;
    }
}
