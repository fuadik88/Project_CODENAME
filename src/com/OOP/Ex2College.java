package com.OOP;

public class Ex2College {
    public static void main(String[] args) {
        Learner[] alllearners = new Learner[100];
        generateStudents(alllearners);
        for(byte i=0; i<100; i++){
            System.out.printf("Index %s *** ", i);
            System.out.println(alllearners[i]);  //using toString @Override method
        }
    }

    private static void generateStudents(Learner[] all){
        for(byte i=0; i<100; i++){
            int randomID = (int)(Math.random() * 500 + 1);
            int randomScore = (int)(Math.random() * 100 + 1);
            Learner std1 = new Learner(randomID, randomScore);
            all[i] = std1;
        }
    }
}

class Learner {
    private int id; private int score;

    public Learner(int sID, int sScore){
        id = sID; score = sScore;
    }
    public void wLearnerInfo(){
        System.out.println("ID: " + id + "  --- Score: " + score);
    }

    @Override
    public String toString() {
        return "ID: " + id + "  --- Score: " + score;
    }
}
