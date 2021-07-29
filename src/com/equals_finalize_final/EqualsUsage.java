package com.equals_finalize_final;

import java.util.Objects;

public class EqualsUsage {
    public static void main(String[] args) {
        Person ps = new Person(6,"Fuad");
        Person ps2 = new Person(6,"Fuad");
        Rector r2 = new Rector(6,"Freddy");
        System.out.println(ps.equals(ps2));
        ps=ps2;
        System.out.println(ps.equals(r2));
    }
}

class Person{
     int id;  String name;
    public Person(int id, String name){
        this.id = id; this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class Rector{
    int id; String name;
    public Rector(int id, String name){
        this.id=id; this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rector rector = (Rector) o;
        return id == rector.id && Objects.equals(name, rector.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}