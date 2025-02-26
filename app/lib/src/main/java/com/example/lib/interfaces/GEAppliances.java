package com.example.lib.interfaces;

public class GEAppliances implements SwitchBoardListener{
    @Override
    public void switchOne() {
        System.out.println("ge light is on");
    }

    @Override
    public void switchtwo() {
        System.out.println("ge ac is on");

    }

    @Override
    public void switchthree() {
        System.out.println("ge fan is on");

    }

    @Override
    public void switchfour() {
        System.out.println("ge bell is on");

    }
}
