package com.file_operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        try(BufferedReader rd = new BufferedReader(new FileReader("list.txt"))){


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Employee{
    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Salary: " + salary;
    }
}
