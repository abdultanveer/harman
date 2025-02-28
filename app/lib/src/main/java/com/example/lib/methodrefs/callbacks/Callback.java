package com.example.lib.methodrefs.callbacks;


public class Callback {


    int addAmruta(int a,int b ){
        return  a+b;
    }

    void meghaMultiply(int a, int b,VisitingCard visitingCard){
        try {
            Thread.sleep(10000);
           visitingCard.myPhoneNo(a*b);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
