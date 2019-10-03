package com.manchesterdigital;

public enum Countries {

    GERMANY("Germany", "de"), SPAIN("Spain", "es"),
    DENMARK("Denmark", "d"), FRANCE("France", "f");




    // enums created one time only
    // enums always in capitals
    // if you write germany.getname gives you above
    // can use getter (below)
    // ROUND PARENTHESIS IS REPRESENTATION OF THE CONSTRUCTOR
    // always separated with a comma, not list otherwise error



    private String name;
    // associates name with the enum

    private String isoCode;
    // associates the code for countries to the enum


    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    Countries(String name, String isoCode) {
        this.name = name;
        this.isoCode = isoCode;
        // default version and not public. only at default level
        //


    }


}
