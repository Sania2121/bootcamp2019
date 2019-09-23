package com.manchesterdigital;

public class Variables {
static boolean isHungry = false;
    //instance variable as it is not in the static part below (without static)
    // to use a varaable like this, just put static before the data type (now becomes a class variable)
    //declared within the scope of the class level which means its available in the entire class and can be used by all

    static int counter = 0;

    public static void main(String[] args) {
        greetWhenAdult(12);

    }

    /**
     * greets based on age
     * @param age this is the required age.
     */




    private static void greetWhenAdult() {
    }

    private static void greetWhenAdult(int age) {
        boolean isHappy = true;
        //example above is a local variable as it is only available in this method and visibility only in curly braces

        // in parenthesis is an example of an expression too
        //evaluates to either yes or no depending on factors

        if (!isHungry) { // if it is italic it is static!
        if (isHappy && age >= 18) {
            System.out.println("Hello");
        }
        }
    }
}
