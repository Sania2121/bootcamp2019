package com.manchesterdigital;

import java.util.ArrayList;

public class ArrayChallenge {

    public static void main(String[] args) {


    }

    private static boolean only1or4(ArrayList<Integer> numbers) {

        boolean result = true;

        // what will contain the value/extracting out and what we are looping over
        for (Integer number : numbers) {
            if(!number.equals(1)  && !number.equals(4)) {
                result = false;
                break;
            }
        }
        return result;

    }

    /*
    listen back to recording at 6:20
     */
}
