package com.PROJECT_udemy_player;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Apprentice std = new Apprentice("Henry", "Intros", "henry777");
        Instructor inst = new Instructor("Fuad", "Fuad intro", "fuadmonsoon");
        Instructor inst2 = new Instructor("Paul", "Paul intro", "paulwalkersjs");

        System.out.println(std);
        System.out.println(inst);

        Lesson les1 = new Lesson(1, "deploying Java applets", 23.35);
        Lesson les2 = new Lesson(2, "SQL queries", 17);
        Lesson les3 = new Lesson(3, "PL/SQL", 26.20);
        Lesson les4 = new Lesson(4, "SLIs", 26.20);

        Course c1 = new Course("Spring Framework", inst);
        Course c2 = new Course("Java EE", inst);
        Course c3 = new Course("Network Engineering", inst);
        c1.addLesson(les1);
        c1.addLesson(les2);
        c1.addLesson(les3);
        //
        c2.addLesson(les1);
        c2.addLesson(les2);
        c2.addLesson(les3);
        //
        c3.addLesson(les1);
        c3.addLesson(les2);
        c3.addLesson(les3);
        c3.addLesson(les4);

        c1.addInstructor(inst2);

        c1.delInstructor(inst);
        c1.delInstructor(inst2);
        c1.addInstructor(inst);
        System.out.println(c1.getCourseLearners());

        std.enroll(c1);
        std.enroll(c2);
        std.enroll(c3);

        System.out.println(std);
        System.out.println(c1.getCourseLearners());
        std.addToPlaylist(les4);
        std.addToPlaylist(les4);
        std.addToPlaylist(les3);
        System.out.println(c1.getCourseContent());

        controlPlaylist(std.getPlayList());

    }

    private static void controlPlaylist(LinkedList<String> pl) {
        ListIterator<String> iterator = pl.listIterator();
        boolean exit = false;
        if (pl.size() == 0) System.out.println("Playlist is empty");
        else System.out.println("Current playing: " + iterator.next());

        showMenu();
        while (!exit) {
            System.out.println("Choose the option...");
            String input = sc.next();

            switch (input) {
                case "0":
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                case "1":
                    if (iterator.hasNext()) System.out.println(iterator.next());
                    else System.out.println("THE END!");
                    break;
                case "2":
                    if (iterator.hasPrevious()) System.out.println(iterator.previous());
                    else System.out.println("AT BEGINNING!");
                    break;
                case "3":
                    showPlaylist(pl);
                    break;
                case "9":
                    showMenu();
                    break;
                default:
                    System.out.println("Choose the given options!");

            }
        }

    }

    private static void showPlaylist(LinkedList<String> pl) {
        ListIterator<String> iterator = pl.listIterator();
        if (pl.size() == 0) System.out.println("Playlist is empty");
        else while (iterator.hasNext()) System.out.println(iterator.next());

    }

    private static void showMenu() {
        System.out.println("************  MENU  ************");
        System.out.println("0 --- Exit\n" +
                "1 --- Next Lesson\n" +
                "2 --- Previous Lesson\n" +
                "3 --- Show Playlist\n" +
                "4 ---\n" +
                "9 --- Show Menu");
    }
}
