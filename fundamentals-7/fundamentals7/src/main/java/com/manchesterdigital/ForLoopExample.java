package com.manchesterdigital;

public class ForLoopExample {

    public static void main(String[] args) {
        /**
         * for (initialisation; boolean expression; update statement) {
         * // one or more lines of logic
         * }
         */


        // preferred method
        for (int i = 0; i <= 100; i++) {
            System.out.println("i =>" + i);
            // starts at 0 and carries on going up by 1 until it hits 100
            //used for FizzBuzz

        }
        // initialise in or outside
        int x = 0;
        for (x = 0; x <= 100; x++) {
            System.out.println("x =>" + x);
            // starts at 0 and carries on going up by 1 until it hits 100
            //used for FizzBuzz
            System.out.println("outside x " + x);
        }

      //  for(;;) {
        //    System.out.println("wohooooo");
        // infinite loop!!!!!!!!!!!!
        // do not use!!!

        }

    }

