package com.manchesterdigital;

public class InterestCaloculator {



    public static void main(String[] args) {

        int sum = 0;


        for (int x = 1; x <= 500 ; x++) {

            if((x % 3 == 0) && (x % 5 == 0)) {
                sum += x;
                System.out.println("Numver is" + x);
                System.out.println("Sum is" + sum);
            }


        }

        System.out.println("Total is" + sum);

        double amount = 100.0d;

        for (int i = 10; i <= 50; i+= 10) {
            System.out.println(calculateInterest(amount, i));

        }
    // boiler plate for for loop is fori
    }



    private static double calculateInterest(double amount, int i) {
        return (amount * i) / 100;
        // calling a loop with a function inside of it





        }
    }



