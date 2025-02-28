package com.example.lib.methodrefs.callbacks;

public class MyAssistant implements VisitingCard {


    @Override
    public void myPhoneNo(int result) {
        System.out.println("the mul result is --"+result);

    }
}
