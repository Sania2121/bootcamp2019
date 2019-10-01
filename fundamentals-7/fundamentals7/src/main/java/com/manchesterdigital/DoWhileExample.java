package com.manchesterdigital;

public class DoWhileExample {

    public static void main(String[] args) {
        /**
         * do {
         * // body or logic
         * } while (boolean expression);
         */

      /*  boolean isLying = false;
        do {
            System.out.println("Can't wait for today to finish");
        } while(isLying);
    }
*/
        int number = 0;

        do {
            System.out.println(number++);
        } while (number <= 7);

    }
}

/*
used when something is run only once or at least once
 */