package com.manchesterdigital;

public class SwitchStatements {

    public static final int TEN_PENCE = 10;

    public static void main(String[] args) {

        int coinInserted = 50;

        switch (coinInserted) {
            case TEN_PENCE:
                System.out.println("Inserted 10p!");
                break;
// constants do not allow numerical values
            // principle DRY dont repeat yourself
            // KISS keep it simple stupid

            case 20:
                System.out.println(:"Inserted 20p");
                break;

            case 30:
                System.out.println("Inserted 30p");
                break;

            case 40:
                System.out.println("Inserted 40p");
                break;

            case 50:
                System.out.println("Inserted 50p");
                break;

            default:
                System.out.println("No coin detected");
        }
        System.out.println("Change given???");
    }

// if you want one message for two options, you remove the leg under the one that you want to get rid of
/*
case 10:
case 20:
    System.out.println("same message");
        break;
 */

    public void

    static warningMessage() {
        System.out.println("Insufficient change");
// can be printed under the 10p and 20p one to say that they have too little change

    }

}