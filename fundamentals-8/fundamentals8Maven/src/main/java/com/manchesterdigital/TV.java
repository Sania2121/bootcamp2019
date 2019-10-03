package com.manchesterdigital;

public class TV extends ElectricalDevices implements Volume, Standby {

    @Override
    public void standbyMode() {
        System.out.println("TV going into Standby mode!");
    }


    @Override
    public void switchOn() {
        System.out.println("TV is switching on");
    }

    @Override
    public void switchOff() {
        System.out.println("TV is switching off");
    }
}
