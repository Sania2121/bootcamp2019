package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class ConvertChallengeTest {

 //   public static final int KILO_UNIT = 1024;
   // public static final int MEGA_UNIT = 1;

    @Test
    public void whenMegabytesIsInsertedKilobytesConversionIsReturned() {
        //ARRANGE
        int kilobyte = 1024;
        int megabyte = 1;

        //ACT

        double result = ConvertChallenge.convert(2);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(2048);
    }

    @Test
    public void whenKilobyteIsInsertedMegabyteIsReturned() {
      //ARRANGE
        int kilobyte = 1024;
        int megabyte = 1;

        //ACT

        double result = ConvertChallenge.convert2(2048);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenMBIsEnteredAndHasRemainderItIsShown() {

    }
}
