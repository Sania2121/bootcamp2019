package com.manchesterdigital;

public class expressionstatements {

    public static void main(String[] args) {
        int numberOfGears = 4;

        int years = 5;

        double interestRate = 0.4d;

        //everything in line below is the expression apart from the data type in orange 
        double amountOfInterest = years * interestRate;
        System.out.println("Interest is" + " " + amountOfInterest);
        
        double radius = 12.0d;
        double outcome = Math.PI * radius * radius;
        // expression above is multiplying the two things together

        int score = 2000; // this is only an initialisation or assignment

        if (score > 1000) { // this is an expression here
            System.out.println("Score is greater than 1000!");
        }


    }
}
