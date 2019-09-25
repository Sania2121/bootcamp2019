package com.manchesterdigital;

import org.w3c.dom.ls.LSOutput;

public class Challenge3 {
    public static void main(String[] args) {

        String string1;
        int age;

        challenge("H", 30);

    }

    private static int challenge(String string1, int age) {

        if (age > 60) {
            System.out.println(string1 + string1);
        } else {
            System.out.println(string1);
        }
return challenge(string1, age);

    }
}