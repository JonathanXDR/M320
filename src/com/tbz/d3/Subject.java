package com.tbz.d3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subject {
    private String name;
    ArrayList<Grade> grades = new ArrayList<Grade>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }
}
