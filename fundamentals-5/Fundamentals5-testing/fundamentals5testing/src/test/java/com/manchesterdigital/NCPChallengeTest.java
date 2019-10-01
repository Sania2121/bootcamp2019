package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class NCPChallengeTest  {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenTimeIsMidnightThenCostIs300() {
        int costIs = 300;
        int time = 0;

        double result = NCPChallenge.convert(time);


        Assertions.assertThat(result).isEqualTo(300);
    }

    @Test
    public void whenTimeIs5AMThenCostIs350() {
        int costIs = 300;
        int time = 5;

        double result = NCPChallenge.convert(time);


        Assertions.assertThat(result).isEqualTo(costIs);
    }

    @Test
    public void whenTimeIs10AMThenCostIs500() {
        int costIs = 350;
        int time = 10;

        double result = NCPChallenge.convert(time);

        Assertions.assertThat(result).isEqualTo(costIs);
    }

    @Test
    public void whenTimeIs9AMMThenCostIs350() {
        int costIs = 350;
        int time = 9;

        double result = NCPChallenge.convert(time);

        Assertions.assertThat(result).isEqualTo(costIs);
    }

    @Test
    public void whenTimeIs13AMMThenCostIs350() {
        int costIs = 500;
        int time = 13;

        double result = NCPChallenge.convert(time);

        Assertions.assertThat(result).isEqualTo(costIs);
    }

    @Test
    public void whenTimeIs4PMThenCostIs700() {
        int costIs = 700;
        int time = 16;

        double result = NCPChallenge.convert(time);

        Assertions.assertThat(result).isEqualTo(costIs);
    }

    @Test
    public void whenTimeIs21CostIs400() {
        int costIs = 400;
        int time = 21;

        double result = NCPChallenge.convert(time);

        Assertions.assertThat(result).isEqualTo(costIs);
    }

    @Test
    public void whenTimeIsInvalid() {
        expectedException.expect(InvalidTimeInput.class);

        NCPChallenge.convert(-1);

        Assertions.assertThat(expectedException).isInstanceOf(InvalidTimeInput.class);


    }
}
