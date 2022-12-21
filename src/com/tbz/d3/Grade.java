package com.tbz.d3;

public class Grade {
    private String name;
    private int grade;
    private int weight;

    public Grade(String name, int grade, int weight) {
        this.name = name;
        this.grade = grade;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getWeight() {
        return weight;
    }
}
