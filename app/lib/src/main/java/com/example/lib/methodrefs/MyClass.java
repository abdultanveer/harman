package com.example.lib.methodrefs;

public class MyClass {

    public static void main(String[] args) {
        Sayable sayable = () -> {
            System.out.println("normal lamda imple");
        };

        sayable.say();
        Sayable sayable1 = MethodReference::saySomething;
        sayable1.say();
    }
}