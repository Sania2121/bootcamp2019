package com.manchesterdigital;

// private static final BAD_OUTCOME = 0;
// private static final GOOD_OUTCOME = 1;
// private static final GREAT_OUTCOME = 2;

public class Challenge1 {
    public static void main(String[] args) {
        int tea = 2;
        int candy = 4;
        int party;

        if (tea < 5 || candy < 5) {
            party = 0;
            System.out.println("Party is bad" + " " + party);
        } else if ((candy >= (tea * 2)) || (tea >= (candy * 2))) {
            /* need to use the >= operator to make sure it works as opposed to just ==
            */
            party = 2;
            System.out.println("Party is great" + " " + party);

        } else {
            party = 1; // place the comntants in here
            System.out.println("Party is good" + " " + party);

        }
    }
}
/*
to improve, maybe use constants instead of numbers in the return section
also get rid of the else at the bottom and just have a return value as that would be the default essentially. this
just needs to be indented more to the left as opposed to the right
 */

// code coverage is how its tested and thats the important thing in TDD
/*
code coverage will be discussed later on
 */