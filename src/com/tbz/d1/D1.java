package com.tbz.d1;

public class D1 {
    public void Start(){
        Student student = new Student("Jonathan");
        student.setAge(12);

        student.increaseAge();

        int age = student.getAge();

        System.out.println(age);
        System.out.println(student.getName());
    }
}
