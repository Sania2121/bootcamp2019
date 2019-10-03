package com.manchesterdigital;

public interface IsChargeable {

    void supercharge();

    default void describe() {
        System.out.println("I'm green!");
    } // can be taken in by any that is implementing this interface
    // now implicitly available to new tesla through tesla.describe


}
