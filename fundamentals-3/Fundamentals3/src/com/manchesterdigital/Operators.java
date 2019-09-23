package com.manchesterdigital;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2; // addition operator used to add
        System.out.println("Result is " + result); // + is used for concatenation

        // subtract :

        result = 3 - 1;
        System.out.println("Result is " + result);


        //multiply
        result = 3 * 7;
        System.out.println("Result is " + result);

        // divide
        result = 21 / 3;
        System.out.println("Result is " + result);

        // remainders
        result = 21 % 10; // modulus or remainder. only shows the leftover remainder
        System.out.println("Result is " + result);


        // increment
        result = result + 1;

        // abbrevitaed increment

        result++;

        // post increment
        result++; // symbol is after the variable

        //pre-increment
        ++result;

        // important for loops and iterations

        // decrement
        result = result - 1;


        // posty decrement
        result--;


        // pre decrement
        --result;


        result = result += 3;

// additiuon operator in an abbreviated way
    result += 3;

    result = result -10;

    // same as above
    result -= 10;

    result = result * 20;

    //or

        result *= 20;

        // divides

        result = result / 5;

        result /= 5;


    boolean isRainingToday = false;

    int number1 = 100;
    int number2 = 200;


int degreeScore = 60;
int overallScore = 100;

if(degreeScore >= 60 && overallScore >= 100);
        System.out.println("Woohooo");
// AND operator
        // the whole thing is an expression and is made up of two more expressions

  //      if(degreeScore = 60 || overallScore 100);
        // OR operator

        boolean isAnimal = false;

   /*     if(isAnimal = true) { // here is it reassigning as opposed to being an if statement
            System.out.println("I am an animal!");
        } */


        if(isAnimal == true) {
            System.out.println("I am an animal"); // actually checks the equality as opposed to the above one
        }
// or do the following

        if(!isAnimal) {
            System.out.println("Not an animal");

        }


    if(number1 == number2) // is equal to
        System.out.println("Same!");
    // checks the equality of the value not the object

        if(number1 != number2)
            System.out.println("Not equal!");
        // checks the not equal

        if(number1 < number2) // should read the if word as 'is'
            System.out.println("Smaller");
        // works both ways for greater than and both than

        if(number1 <= 100)
            System.out.println("Greater than or equal to");
        // opposite can be done too for less than or equals to

    if(isRainingToday){ // is an expression, just a short hand one because it evaluates if it is true or false
        System.out.println("You won't need a jacket today!");
        // wont work unless you change as below

        if(!isRainingToday) {
            System.out.println("You wont need a jacket today!");
            // example of the NOT operator
        }

    }

String lastName = "Choudhry";

        if(lastName.equals("Choudhry"))
            System.out.println("This is the right one");
        // is always CASE SENSITIVE
        // but there is an .equalsIgnoreCase that will ignore the cases

 // everything is a generic class called object but we are being explicit here
    }

    int numberOfMealsToday = 1;

    // an example of a ternary operator
    boolean isHungry = numberOfMealsToday == 1 ? true : false; // true on left always first
    // NEED TO RESEARCH IT FURTHER
    // sbhorthand way of righting an if statement
    // this is another operator
    // takes an expression and gives you the happy or the non happy result


}
