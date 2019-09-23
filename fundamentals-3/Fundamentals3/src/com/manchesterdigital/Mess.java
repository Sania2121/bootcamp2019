package com.manchesterdigital;

public class Mess {
    public static void main(String[] args) {
            double number3 = 20;
            int number4 = 80;
            double total2 = (number3 + number4) * 25;
            double remainder2 = total2 % 40;
            System.out.println(remainder2);

            if (remainder2 <= 20) {
                System.out.println("Total was over the limit");
            }
    }
}
