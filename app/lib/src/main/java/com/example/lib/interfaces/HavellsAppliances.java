package com.example.lib.interfaces;

public class HavellsAppliances implements SwitchBoardListener{
    @Override
    public void switchOne() {
        System.out.println("havells light is on");
    }

    @Override
    public void switchtwo() {
        System.out.println("havells ac is on");

    }

    @Override
    public void switchthree() {
        System.out.println("havells fan is on");

    }

    @Override
    public void switchfour() {
        System.out.println("havells bell is on");

    }
}
