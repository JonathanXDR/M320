package com.tbz.d1;

public class Student {
    private int Age = 0;
    private String Name;

    public Student(String name){
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    public  void increaseAge() {
        Age++;
    }
}

