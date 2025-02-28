package com.example.lib.methodrefs.callbacks;

public class Myself {

    public static void main(String[] args) {
        Callback callback = new Callback();
       int sum = callback.addAmruta(10,20);
        System.out.println(""+sum);
        VisitingCard mysecratary = new  MyAssistant();
        callback.meghaMultiply(123,456,mysecratary);
    }

}
