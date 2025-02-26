package com.example.harman.kotlinexs;

public class Student {
    String name;
    int age;
    int height;
    boolean isEligible;

    public Student(String name, int age, int height, boolean isEligible) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isEligible = isEligible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }
}
