package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    // write the tests first!!


    @Test
    public void whenFahrenheitIsZeroThenCelciusIsMinus17() {
        //ARRANGE
        String unitToConvertTo = "c";
        int temperature = 0;

        //ACT
        double result = TemperatureConverter.convert("C", 0);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(-17.0);
    } // this block above is my first unit test

    @Test
    public void whenFahrenheitIs100ThenCelciusIs38() {
        //ARRANGE
        String unitToConvertTo = "c";
        int temperature = 100;

        //ACT
        double result = TemperatureConverter.convert("C", 0);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(38);
    }
}
