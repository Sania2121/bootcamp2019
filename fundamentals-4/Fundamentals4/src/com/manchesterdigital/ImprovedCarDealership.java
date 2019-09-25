package com.manchesterdigital;

public class ImprovedCarDealership {
    // remember DRY do not repeat yourself

    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfSales = 1000;
        double commissionRate = 3.0;
        int bonus = 1000;

            calcSalary(taxYearEnded, numberOfSales, baseSalary, commissionRate);

            numberOfSales = 300;
            baseSalary  = 25000;
            commissionRate = 2.0;

        calcSalary(taxYearEnded, numberOfSales, baseSalary, commissionRate);
    }

    private static void calcSalary(boolean taxYearEnded,
                                   int numberOfSale,
                                   int baseSalary,
                                   double commissionRate) {
        // can provide one or many or no arguments as above


        if (taxYearEnded) {
            int bonus = 1000;
            double totalSalary = baseSalary;

            if (numberOfSale > 500) {
                totalSalary = baseSalary + (numberOfSale * commissionRate);
                totalSalary += bonus;
            }

            System.out.println("total salary is" + " " + totalSalary);
        }
    }
}
