package com.manchesterdigital;

public class NCPChallenge {

    public static final int FROM_MIDNIGHT_TO_5 = 300;
    public static final int FROM_FIVE_TO_10 = 350;
    public static final int FROM_TEN_TO_15 = 500;
    public static final int FROM_FIFTEEN_TO_20 = 700;
    public static final int FROM_20_TO_MIDNIGHT = 400;


    public static int convert(int time) {
        int result = FROM_20_TO_MIDNIGHT;

        if (time == -1) {
            throw new InvalidTimeInput("Invalid Time Provided" + time);
        }

        if(time <= 5) {
            result = FROM_MIDNIGHT_TO_5;
        } else if(time <= 10) {
            result = FROM_FIVE_TO_10;
        } else if(time <= 15) {
            result = FROM_TEN_TO_15;
        } else if(time <= 20) {
            result = FROM_FIFTEEN_TO_20;
        }
        return result;
    }
}
