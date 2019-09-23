package com.manchesterdigital;

public class ChallengeAnswer {

    public static void main(String[] args) {
        System.out.println(lastDigit());
    }

    public static boolean lastDigit() {
        int num1 = 12;
        int num2 = 42;

        if(num1 % 10 == num2 % 10) {
            return true;
        } else {
            return false;
        }
    }
}
