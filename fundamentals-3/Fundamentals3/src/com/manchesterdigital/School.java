package com.manchesterdigital;

import static com.manchesterdigital.Student.CLASS_NAME;
//importing static variable

//just ian import bringhs in an entire class

public class School {

    public static void main(String[] args) {
        Student april =  new Student("April");
        april.printDetails();

        System.out.println(CLASS_NAME);
        // static is always class level
        // imported the static import is java preferred method but depends on organisation

    }

}
