package com.tbz.d3;

public class Grade {
    private String name;
    private float grade;
    private float weight;

    public Grade(String name, int grade, int weight) {
        this.name = name;
        this.grade = grade;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public float getWeight() {
        return weight;
    }
}
