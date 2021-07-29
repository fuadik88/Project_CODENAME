package com.inheritance;

public class InheritanceOnNonInherit {
    public static void main(String[] args) {
        Personnel director = new Personnel("Larry", 350873284, 42);
        System.out.println(director.getAge());
        System.out.println(director);
        Student std1 = new Student("Fuad", 4675, 21, 48);
        System.out.println(std1);
    }
}

class Personnel {
    private String name; private long id; private int age;

    public Personnel(){
        name = "Not yet assigned";
        id = 0; age = 18;
    }

    public Personnel(String name, long id, int age) {
        this.name = name;
        this.id = id;
        setAge(age);         // To prevent invalid age (negative number)
    }                       // we use method instead of raw equation, where
                           // conditional statements are applied
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18) this.age = age;
        else {this.age=18;
            System.out.println("The age is set to minimum value, 18.");
        }
    }

    @Override
    public String toString() {
        return "Personnel Name: " + name + " | ID:" + id + " | Age: " + age;
    }

}

class Student extends Personnel {
    private  int schoolNo;

    public Student(String name, long id, int age, int schoolNo) {
        super(name,id,age);
        this.schoolNo = schoolNo;
    }

    private int getSchoolNo(){
        return schoolNo;
    }

    @Override
    public String toString() {
        return "Personnel Name: " + getName() + " | ID:" + getId() + " | Age: " + getAge() + " | SchoolNo: " + schoolNo;
    }
}