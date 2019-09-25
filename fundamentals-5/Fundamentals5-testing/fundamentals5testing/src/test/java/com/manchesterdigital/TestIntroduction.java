package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestIntroduction {

    // test is no different to writing normal code


    @Test //known as an annotation and needs to be used throughout java tests
    public void testThatABankAccountTakesAnInputWhenDeposited() {  // do not give it a stupid name firstly!

    }

    @Test
    public void shouldTakeInputWhenDeposited() {

    }

    @Test
    public void givenBankAccountWhenInputThenDeposited() { // most common one
        // style is known as BDD behavioural driven development
        // BA user stories are based on this
    }

    @Test
    public void shouldAddTwoNumbers() {

        //ARRANGE not always done because not always necessary
        int first = 23;
        int second = 23;


        //ACT
        int result = first + second;
        // what i am trying to test

        //ASSERT
        Assertions.assertThat(result).isEqualTo(46);



    }
}

// j unit is a runner and allows you to test and run your code
/*
tests run in parallel and any random order
do not write code that relies on another test
code inside main folder is the only one productionised
after testing, the report is sent someone who may not be technical. hence the wording above is important so
they know what it is you have tested.
 */