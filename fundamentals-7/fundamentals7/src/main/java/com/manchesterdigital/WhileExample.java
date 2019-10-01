package com.manchesterdigital;

public class WhileExample {

    public static void main(String[] args) {

        /**
         * while (boolean expression) {
         * // body of logic
         * }
         */


        // similar to an IF statement
        // only used when you have an undetermined list

        double growthRate = 0.04; // 4%
        int population = 800; // initial population
        int year = 0; // present year i.e present time

        while (population <= 1200) {
            Double tempPopulation = population * (1 + growthRate);
            population = tempPopulation.intValue();
            year++;

        }



    }

}
/*
one of the harder ones to use
 */