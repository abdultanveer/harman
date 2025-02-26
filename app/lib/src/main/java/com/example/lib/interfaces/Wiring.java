package com.example.lib.interfaces;



public class Wiring {
    public static void main(String[] args) {
        SwitchBoardListener sbl = new GEAppliances();
                //new HavellsAppliances();

        sbl.switchOne();
        sbl.switchtwo();
        sbl.switchthree();
        sbl.switchfour();
    }

}
