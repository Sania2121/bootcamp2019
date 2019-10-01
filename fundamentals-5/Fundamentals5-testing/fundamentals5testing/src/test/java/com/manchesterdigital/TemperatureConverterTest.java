package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TemperatureConverterTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // write the tests first!!


    @Test
    public void whenFahrenheitIsZeroThenCelciusIsMinus17() {
        //ARRANGE
        String unitToConvertTo = "C";
        int temperature = 0;

        //ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(-17.0);
    } // this block above is my first unit test

    @Test
    public void whenFahrenheitIs100ThenCelciusIs38() {
        //ARRANGE
        String unitToConvertTo = "C";
        int temperature = 100;

        //ACT
        double result = TemperatureConverter.convert( unitToConvertTo, temperature);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(37);
    }

    @Test
    public void whenFahrenheitIs150ThenCelciusIs10() {
        //ARRANGE
        String unitToConvertTo = "C";
        int temperature = 50;

        //ACT
        double result = TemperatureConverter.convert( unitToConvertTo, temperature);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(10);
    }

    // ------ Celcius to Farenheit ----------------
    // good practice would be to create two separate files


    @Test
    public void whenCelciusIs0ThenFarenheitIs32() {
        String unitToConvertTo = TemperatureConverter.FAHRENHEIT_UNIT;
        int temperature = 0;

        //ACT
        double result = TemperatureConverter.convert( unitToConvertTo, temperature);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(32.0);
    }
    @Test
    public void whenCelciusIs35ThenFarenheitIs95() {
        String unitToConvertTo = "F";
        int temperature = 35;

        //ACT
        double result = TemperatureConverter.convert( unitToConvertTo, temperature);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(95.0);
    }
//method one
    @Test(expected = InvalidConversionUnitException.class) // this expects it and asserts the throw
    public void whenConversionUnitIsNotValidThenExceptionThrown() {
        TemperatureConverter.convert("abdhvbcvhdvc", 0);
    }
// method 2 is BETTER PRACTICE
    @Test
    public void whenConversionUnitIsNotValidThenExceptionThrown2() {
        expectedException.expect(InvalidConversionUnitException.class);

        TemperatureConverter.convert("abdhvbcvhdvc", 0);

        Assertions.assertThat(expectedException).isInstanceOf(InvalidConversionUnitException.class);
    }

    // it has passed but shouldnt have done
    // intention first is to make it fail
}
// proving things have to be specific
// assertions are used to prove X, Y and Z
// should be as refined as possible
// DRY
