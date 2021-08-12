package com.file_operations;

import java.io.*;

public class InputOutputStream {
    public static void main(String[] args) {
        readLoop();
    }

    private static void readFile() {
        DataInputStream rd;
        Student readStd1;
        Student readStd2;

        try {
            rd = new DataInputStream(new BufferedInputStream(new FileInputStream("students.dat")));
            int id = rd.readInt();
            String name = rd.readUTF();
            boolean active = rd.readBoolean();
            readStd1 = new Student(id, name, active);
            System.out.println("Student 1: " + readStd1);

            int id2 = rd.readInt();
            String name2 = rd.readUTF();
            boolean active2 = rd.readBoolean();
            readStd2 = new Student(id2, name2, active2);
            System.out.println("Student 2: " + readStd2);

        } catch (IOException e) {
            e.getCause();
        }
    }

    private static void readLoop() {
        DataInputStream rd = null;
        Student readStd;
        boolean endLoop = false;
        try {
            rd = new DataInputStream(new FileInputStream("students.dat"));
            while (!endLoop) {
                try {
                    int id = rd.readInt();
                    String name = rd.readUTF();
                    boolean active = rd.readBoolean();
                    readStd = new Student(id, name, active);
                    System.out.println(readStd);
                } catch (IOException ee) {
                    System.out.println("Reached End of File");
                    ee.getCause();
                    endLoop = true;
                }
            }
        } catch (FileNotFoundException fe) {
            fe.getCause();
        } finally {
            if (rd != null) {
                try {
                    rd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeFile() {
        DataOutputStream wr = null;
        Student std1 = new Student(1, "Parker", true);
        Student std2 = new Student(2, "Harry", false);
        Student std3 = new Student(3, "MaryJane", false);
        Student std4 = new Student(4, "Gwen", true);

            try {
                wr = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("students.dat")));
                wr.writeInt(std1.id);
                wr.writeUTF(std1.name);
                wr.writeBoolean(std1.active);

                wr.writeInt(std2.id);
                wr.writeUTF(std2.name);
                wr.writeBoolean(std2.active);

                wr.writeInt(std3.id);
                wr.writeUTF(std3.name);
                wr.writeBoolean(std3.active);

                wr.writeInt(std4.id);
                wr.writeUTF(std4.name);
                wr.writeBoolean(std4.active);

            } catch (IOException e) {
                e.getCause();
            } finally {
                if (wr != null) {
                    try {
                        wr.close();
                    } catch (IOException ie) {
                        ie.getCause();
                    }
                }
            }
    }
}

class Student {
    int id;
    String name;
    boolean active;

    public Student(int id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | isActive: " + active;
    }
}