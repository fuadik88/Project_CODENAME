package com.OOP;


public class OopEntry {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        Student alex = new Student();
        alex.name = "Alex Reeves";
        alex.ID = 1;
        alex.sclass = 10;
        alex.t = true;
        alex.wStudentInfo();
        alex.isActive();

        Student chris = new Student();
        chris.name = "Chris ";
        chris.ID = 2;
        chris.sclass = 11;
        chris.t = true;
        chris.wStudentInfo();

        Student henry = new Student(4,"Henry", (byte)8, true);
        henry.wStudentInfo();

        Student richard = new Student(5,"Richard", (byte) 10, true);
        richard.wStudentInfo();

        Student grace = new Student("Grace");

        student[0] = grace;
        student[1] = richard;
        student[2] = chris;
        student[3] = henry;
        student[4] = alex;
        student[0].wStudentInfo();
        student[0].t = true; student[0].ID = 7;
        student[0].wStudentInfo();

    }
}
