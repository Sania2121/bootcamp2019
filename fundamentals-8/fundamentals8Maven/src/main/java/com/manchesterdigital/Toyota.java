package com.manchesterdigital;

public class Toyota extends Vehicle implements Movement {
    public Toyota(String colour, Integer numberOfSeats, Double engineSize, TransmissionType transmissionType, String manufacturer) {
        super(colour, numberOfSeats, engineSize, transmissionType, manufacturer);
    }


    @Override
    public void moveForward() {
        System.out.println("Accelerating");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing");
    }

    @Override
    public void drifts() {
        System.out.println("Drifting!!!");
    }

    @Override
    public void revving() {
        System.out.println("Revving!");
    }
}
