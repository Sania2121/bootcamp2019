package com.manchesterdigital;

import org.w3c.dom.ls.LSOutput;

public class Scratch {

  public static Boolean isEven(int a) {

      return (a % 2 ==0);
  }

  private static boolean isName(String a, String b) {
      return(a.equalsIgnoreCase(b));
      // my solution above. still works but refactored below
  }
  // should change it to public so can be accessed on the other side
    /*
    refactored code
    public static boolean isNamesMatch(String firstName, String lastName) {
        return (firstName.equalsIgnoreCase(lastName));
        }
        NAMING CONVENTIONS ARE VERY IMPORTANT



     */


    Scratch2 poodle = new Scratch2(21);
    // object of scratch 2, or dog as assad named his class, instance called poodle. CHECK THIS ON recording 1:19
    //

}

// any numerical data type has to use ==
// when using non primitive use .equals version of it
// compilation error is compiler having an issue with what you've coded
// run time error means compiler can run it but issues when running code


  // option below from student
// above was assad way


  /*  public static boolean isEven(int a) {

        if( a % 2 == 0) {
            return true;
        }

        // better to use a Boolean wrapper class above because of auto boxing etc.
        // recording at 23 ish
        return false;

        }

    } */


/*
static is usually used for throwaway functions or from a variable point of view as in only ever used as a reference
similar to localised data base
something that is not going to change

 */