package com.manchesterdigital;

public class Exceptions {

    public static void main(String[] args) {
        int [] intArr = {12, 3, 5};

        printArray(0, intArr);
        printArray(1, intArr);
        printArray(2, intArr);

        // test
        try {
            // try to access element 3:
            printArray(3, intArr);
        }
        catch(ArrayIndexOutOfBoundsException aioobe) {

            System.err.println("Element does not exist: " + aioobe.getLocalizedMessage()); // denotes that it is an error
            // massively helps people to understand what could have potentially gone wrong
            // by adding the aioobe allows it to be traced
            // . get localised message is what compiler thinks is wrong
            // try and catch method is not enforced as it is something you can do on your own
            // javadoc will show the entire host of methods that you can use
            // the exceptions will also be listed there so that you can use it on your code
            // stakc trace is the tree that is object to throwable to etc etc etc

        }


        // this is the error you receive at the bottom when you run it
            // allows you catch the error in this code block
        //
    }

    public static void printArray(int index , int [] arr ) {
        System.out.println("Element " + index + arr[index]);
    }

    public static Long convertStringToLong(String input) throws NumberFormatException{
        return new Long(input);
    }
}
/* best practices for making exceptions are on notes

 */