package com.manchesterdigital;

public class Currys {

public static void putOnStanby(Standby standby) {
    standby.standbyMode();

}



    public static void main(String[] args) {
        TV tv = new TV();
        Fridge fridge = new Fridge();

        putOnStanby(tv);
        putOnStanby(fridge);
    }







}
