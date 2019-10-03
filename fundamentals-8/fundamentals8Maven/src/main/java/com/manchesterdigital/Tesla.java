package com.manchesterdigital;

public class Tesla extends Vehicle implements Movement, IsChargeable{
    public Tesla(String colour, Integer numberOfSeats, Double engineSize, TransmissionType transmissionType, String manufacturer) {
        super(colour, numberOfSeats, engineSize, transmissionType, manufacturer);
    }

    @Override
    public void moveForward() {
        System.out.println("Accelerating forward!");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing!");
    }

    @Override
    public void drifts() {
        System.out.println("Drifting!!");
    }

    @Override
    public void revving() {
        System.out.println("Ready to race");
    }

    @Override
    public void supercharge() {
        System.out.println("Supercharging!!!");
// only applies to tesla and not toyota
    }




}
