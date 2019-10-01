package com.manchesterdigital;

import java.util.*;

public class ArrayListsExample {
    public static void main(String[] args) {
        // generic way of creating an array list
        ArrayList names1 = new ArrayList();
        // new object of type arraylist

        ArrayList <String> names2 = new ArrayList<>();
                // diamonds remove generics from java
        // everything in names 2 should be a string
        // diamonds dont need to be filled again on the right as the compiler knows
        // left side must be filled in
        // only class types can be put in the diamond and have to be wrapper class as in starting with CAPITAL LETTERS

        names2.add("John");

        names2.add("Sue");

        // adds them to the list/cells in the arrays
        // not limited to a certain length

        names2.add(1, "Steve");


        int numberOfElements = names2.size();
        System.out.println("number is " + numberOfElements);

        String firstElement = names2.get(0);
        System.out.println("first element is " + firstElement);

        boolean successfullyRemovedViaObject = names2.remove("Steve");//removes object
        String removedElement = names2.remove(0);// removes a certain index
        System.out.println(removedElement);
        System.out.println(names2);
        System.out.println(successfullyRemovedViaObject);


        ArrayList<String> zooAnimals = new ArrayList<>();
        zooAnimals.add("lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");
        zooAnimals.add("Cheetah");


        zooAnimals.contains("Leopard"); // search it. case sensitive!!!
        System.out.println(zooAnimals.contains("Leopard"));

        // sort
        Collections.sort(zooAnimals);

        System.out.println(zooAnimals.get(0));

        // shuffle
        Collections.shuffle(zooAnimals); // randomises the list and gives you the outcome at X Y Z

        //

        //overrides a element at index X
        zooAnimals.set(1, "Jaguar"); // effectively replace
        // replaces hippo with jaguar

        System.out.println(zooAnimals);
        System.out.println(zooAnimals.get(1));

        zooAnimals.clear(); // empties array list
        zooAnimals.size();
        System.out.println(zooAnimals.size());

//previously used methods
    int [] lotteryArray = new int [10];
    int [] lotteryArr2 = {1, 2, 3, 45, 6};



        //shorthand way of pre arranging array list
        // much quicker than creating array list and then adding X Y and Z etc
        // predefined array list

        List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88);

        // lotteryNumbers. ;// still can be used as an array list such as .get etc





        /*
        array lists are used more than arrays as you can use helper functions which are the .adds or .sizes etc

         */

    }
}
