package com.manchesterdigital;

public class Lights implements Controls {
    @Override
    public void switchOn() {
        System.out.println("Pressing the on button");
    }

    @Override
    public void switchOff() {
        System.out.println("Pressing the off button");
    }

    // to bring in interface you have to implement it
    // implement the methods with red light bulb



}
