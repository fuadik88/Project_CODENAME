package com.PROJECT_udemy_player;

import java.util.ArrayList;

public class Course{
    private final String courseName;
    private ArrayList<Lesson> courseContent;
    private ArrayList<Instructor> courseInstructors;
    private ArrayList<String> courseLearners;
    //Minimum 5 lesson and 60 minutes of content
    private boolean isLive;

    public Course(String courseName, Instructor primeInstructor){
        this.courseName = courseName;
        this.courseContent = new ArrayList<>();
        this.courseInstructors = new ArrayList<>();
        this.courseLearners = new ArrayList<>();
        courseInstructors.add(0,primeInstructor);
        this.isLive = false;
    }

    public void addInstructor(Instructor instructor) {
        if (!courseInstructors.contains(instructor)) {
            courseInstructors.add(instructor);
            System.out.println(instructor.getName() + " has been added as a new Instructor.");
        }
        else System.out.println("This instructor already exist in this course!");
    }

    public void delInstructor(Instructor instructor){
        if(!instructor.getUname().equals(courseInstructors.get(0).getUname())) {
            courseInstructors.remove(instructor);
            System.out.println(instructor.getUname() + " successfully removed!");
        }
        else System.out.println("Prime Instructor |" + instructor.getName() + "| can not be removed from the course!");
    }

    public void addLesson(Lesson lesson){
        courseContent.add(lesson);
    }

    public boolean isLive(){
        if(courseDuration()>=60 && courseContent.size()>=3) {
            isLive = true;
            return true;
        }else return false;
    }

    public String getCourseName(){
        return courseName;
    }

    public int courseContent(){
        return courseContent.size();
    }

    public ArrayList<Lesson> getCourseContent(){
        return courseContent;
    }

    public int courseDuration(){
        double duration=0;
        for(Lesson r : courseContent)
            duration += r.getDuration();
        return (int)duration;
    }

    public ArrayList<String> getCourseLearners() {
        return courseLearners;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
