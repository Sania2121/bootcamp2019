package com.manchesterdigital;

public class Fridge extends ElectricalDevices implements Standby {

    @Override
    public void standbyMode() {
        System.out.println("Fridge is going into Standby mode!");
    }

    @Override
    public void switchOn() {
        System.out.println("Fridge is switching on!");
    }

    @Override
    public void switchOff() {
        System.out.println("Fridge is switching off");
    }
}
