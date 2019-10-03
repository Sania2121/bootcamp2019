package com.manchesterdigital;

public enum OrderStatus {

    PENDING("order is pending"),
    DISPATCHED("order has been dispatched"),
    DECLINED("declined no money"),
    AWAITING_PAYMENT("waiting for the money"),
    PROCESSED("sorted");
    // REAL LIFE EXAMPLE
    // NO CONSTRUCTOR AS THERE IS NO INSTANCE VARIABLE DEFINED

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
        // getter allows the messaage to be used ecternally;

    }
}
