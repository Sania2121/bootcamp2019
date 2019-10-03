package com.manchesterdigital;

public class Address {

    private final String addressline1;
    private String addressline2;
    private String addressline3;
    private String addressline4;
    private final String cityTown;
    private final String postcode;

    // only made final to the fields that are actually required


    public Address(String addressline1, String cityTown, String postcode) {
        this.addressline1 = addressline1;
        this.cityTown = cityTown;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressline1='" + addressline1 + '\'' +
                ", addressline2='" + addressline2 + '\'' +
                ", addressline3='" + addressline3 + '\'' +
                ", addressline4='" + addressline4 + '\'' +
                ", cityTown='" + cityTown + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    // have to bring constructor in otherwise above finals would be red
    // it already selects what is needed

}
