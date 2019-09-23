package com.manchesterdigital;

import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
// any library brought in explicitly will be shown up here by default
// if library goes gray then clikc on yellow bulb, optimise and that will get rid of it
/**
 * this is an example where we are playing around with variables
 * describes usage of the variables and data types
 * @author chousa4
 * @author Sania Choudhry.
 *
 */

public class Variables {

    public static void main(String[] args) {

        // data type 1 is integers

        int number = 21;
        int _number;

        //best to use no capitals or camel case where applicable

        int Number; //BAD PRACTICE
        int numberOfAnimals = 10; //GOOD PRACTICE

        System.out.println("number of animals is " + numberOfAnimals);

        //declaring three variables below
        int i1, i2, i3; // BAD PRACTICE!!

        int d1, d2, d3 = 3;
        //only assigns 3 to d3, so pointless as there are actually three that have been declared


        // CANNOT DECLARE TWO DIFFERENT DATA TYPES ON ONE LINE

        //data type 2 is LONG

        long dimateterOfSunInMiles = 12L;

        // L allows you to tell the compiler that this is a long value and to save it accordingly
        // you need to make sure that you sign data types accordingly size-wise

        int miles = 1_000_000; // allows you to use the underscores where you would usually use commas to help read it

        // data type three is a SHORT

        short mile; // very rarely used because it is a small range and there is no guarantee that a number will be in here

        boolean itsRaining = false; // default initialise will always be false

        System.out.println(itsRaining);

        // float

        float pi = (float) 3.14; //makes it a float by adding an f at the end, so its easiest to do that first

        // double

        double percentage = 78.5; // could always add d at the end which explicitly makes it a double
        double percentage2 = 80.9d; // example of line above

        // characters

        char initial = 'S';
        // only need to use double quotes on strings

        /*
        the recording was paused for a while and resumes around here. stopped at 2pm and continued at 2:25
         */

        //moving on to non primitive data types

        // string

        String firstName = "Sania";
        System.out.println(firstName);

        String lastName = "Choudhry";
        System.out.println("Name: " + firstName + " " + lastName); // BAD PRACTICE TO CONCATENATE LIKE THIS.
        //THIS CREATES 4 STRINGS
        /* FIRST NAME, ANONYMOUS, LAST NAME AND ONE IS THE WHOLE OF THE CONTENTS OF BRACKETS I.E "SANIA CHOUDHRY"

         */

        //another way of printing things SOUF
        System.out.printf("%s %s", firstName, lastName); // s stands for strings here. 2 variables hence written twice

        System.out.println(String.format("%s %s", firstName, lastName)); // used more commonly and can be assigned to variable

        StringBuilder output = new StringBuilder();

        output.append(firstName); //append can take anything. this has now put this value into the stringbuilder
        output.append(" ");
        output.append(lastName);

        System.out.println(output);

        output.append(firstName); // is known as fluent api
        // can add anything into this

        output.append(firstName).append(" ").append(lastName); // does the same thing as the three lines above
        //only issue is line count so have to be careful

        // look at recording to hear for breaking it up into new lines and adding semi colons in it
        // cannot just hit enter because it will indent and makes it look rubbish

        // need to look at string builders in more detail

        /* form of a class and is non primitive. you have to add that 'new' bit to actually create it as the first part
        * is only for declaration
        */

        System.out.println(output); // will not work as well as below
        System.out.println(output.toString()); // will work

        // cmd + / will comment out a line
        // option cmd / will comment out a multi line block of code

        // next non primitive data type is arrays

        //  int [] numbers // just declaration. square bracket is an args which is arrays
        int [] numbers = new int[10] ;
        // size goes into the square brackets. ten spaces of type integer to make array structure

        // java index starts at 0

        numbers[0] = 99; // sets the first position in the array to 99

        //   System.out.println(numbers); // would not work. treats numbers as a memory point only

        System.out.println(numbers[0]); // will print 99

        //position in java is known as an element. first element is 0

        System.out.println(Arrays.toString(numbers));
        // utilities class. definition is on recoridng at around 1:45 p2
        // definition of objects on recording

        int [] lotteryNumbers = { 21, 45, 63 }; // use spaces after and before curly braces for visibility
        // curly braces allow you to predefine the values for the array
        /*
        this array is an example that shows how to make a predefined lists that doesnt waste any space as the other
        array did
         */


        System.out.println(lotteryNumbers[0]); // works
        // System.out.println(lotteryNumbers[6]); // doesnt work as it is out of bounds.

        // remember ARRAY LISTS. on recordings

        String [] name = { "Sania", "Alex", "Harry" }; // array can be anything, not just ints


        // error compilation error is wrong compilation or run time error as in issues when running

        // non primitive data type

        Date today = new Date();
        // only choose java util one as that is what we are doing

        System.out.println(today); // should print date of today
        System.out.println(today.toString()); // bit more specific
        //   System.out.println(today.getTime()); // prints epoch time which means seconds from a specific date in 1970
        // google it epoch or epoch time
        // after writing .get, anything lined out is meaning that it is suggested that it is not safe.

        // deprecated means

        hello();


        /* any integer not defined and initialised will be set as the default value which is usually 0

        and will not print and give an error or null message
        */
    }

    /**
     * This is my hello method
     * @deprecated because its crap. Use {@link CodingStandards}
     *
     */
    // linked other document. cmd + click takes you there


@Deprecated
    public static void hello() {
        System.out.println("Hello");
        // hello will be gray if not used but because i put it above it goes yellow
        // created the method called hello
        // this is my hello method.it is static
        /*
        the lines on the .get things mean that they are deprecated but is just a comment
        by writing @ deprecated on line 187 this actually deprecates it as opposed to just commenting it as deprecated
         */

    int numberOfAnimals = 10; // if not initialised then will cause havoc

    Integer numberOfStudents = 20; // class equivalent as it is safer, can also be set to null and still work

    System.out.println(numberOfStudents.longValue());

    // auto boxing means it puts value in the right class. if it fits integer it will make it integer
    // look into the auto boxing
    // unboxing means taking it out of whatever it was previously
    //LOOK AT AUTO BOXING, RAPPER CLASSES, AND UNBOXING

    boolean myBoolean = Boolean.FALSE; // default value. class way of saying use this as a reference instead.

    System.out.println(Integer.MAX_VALUE); // allows you to set the value as maximum for int class
    System.out.println(Integer.MAX_VALUE); // will print out the max value of it

    // allows you to set it. rapper class are in CAPS

 //   Currency = 0;

    //OOP understanding need to brush up on





    }
}
