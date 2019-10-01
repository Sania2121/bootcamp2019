package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumeralsChallengeTest {

    @Test
    public void whenTimeIsMidnightThenCostIs300() {
        int number1 = 5;
        String roman = "V";

        String result = RomanNumeralsChallenge.convert(number1, roman);


        Assertions.assertThat(result).isEqualTo(300);
    }

     
}