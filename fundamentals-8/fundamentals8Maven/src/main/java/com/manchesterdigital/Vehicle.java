package com.manchesterdigital;

public abstract class Vehicle {

    private final String colour;
    private final Integer numberOfSeats;
    private final Double engineSize;
    private final TransmissionType transmissionType;
    private final String manufacturer;

    public Vehicle(String colour, Integer numberOfSeats, Double engineSize,
                   TransmissionType transmissionType, String manufacturer) {
        this.colour = colour;
        this.numberOfSeats = numberOfSeats;
        this.engineSize = engineSize;
        this.transmissionType = transmissionType;
        this.manufacturer = manufacturer;
    }

    // public abstract void supercharge();
}
