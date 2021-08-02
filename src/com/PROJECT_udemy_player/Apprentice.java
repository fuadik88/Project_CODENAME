package com.PROJECT_udemy_player;

import java.util.ArrayList;
import java.util.LinkedList;

public class Apprentice extends User{
    private ArrayList<Course> coursesEnrolled;
    private LinkedList<String> playList;

    public Apprentice(String name, String intro, String uname) {
        super(name, intro, uname);
        this.coursesEnrolled = new ArrayList<>();
        this.playList = new LinkedList<>();
    }

    public void enroll(Course c){
        if(!coursesEnrolled.contains(c) && c.isLive()){
            coursesEnrolled.add(c);
            c.getCourseLearners().add(this.getName());
            System.out.println("Successfully enrolled in course => " + c.getCourseName());
        }
        else System.out.println("You have already enrolled in this course or course is inactive");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n | courses enrolled: " + coursesEnrolled;
    }

    public void addToPlaylist(Lesson lesson){
        boolean isAdded = false;
        if(coursesEnrolled.size()>0){
            for(Course r : coursesEnrolled){
                if(r.getCourseContent().contains(lesson)){
                    isAdded = true;
                    if(!playList.contains(lesson.getTopic())){
                        playList.add(lesson.getTopic());
                        System.out.println(lesson.getTopic() + " lesson in " + r.getCourseName() +
                                " course added to your Playlist");
                        break;
                    } else System.out.println("You have already added this lesson to your Playlist!");
                }
            }
            if(!isAdded) System.out.println("You don't have this lesson!");
        }else System.out.println("You have not enrolled in any course!");
    }

    public LinkedList<String> getPlayList(){
        return playList;
    }

}
