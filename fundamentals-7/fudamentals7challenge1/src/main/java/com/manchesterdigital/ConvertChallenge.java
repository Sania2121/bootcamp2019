package com.manchesterdigital;

public class ConvertChallenge {

    public static double convert(int input) {
        int kilobyte = 1024;

        double result = input * kilobyte;
        //

        return result;
    }


    public static double convert2(int input2) {
        double result = input2 / 1024;
        return result;
    }


}
