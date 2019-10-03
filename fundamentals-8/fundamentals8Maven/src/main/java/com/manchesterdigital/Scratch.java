package com.manchesterdigital;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scratch {

    public static final String RED_COLOUR = "RED";
    // can be accessed by writing Scratch.RED_COLOUR

    public static void main(String[] args) {
        Address address = new Address("21 Long lane", "manchester", "M21 321");
       // Person person = new Person("John", "Doe", 21, address);

        Student student = new Student("Jack", "Smith",
                21, address );
        student.setUniversityName("Manchester");
        System.out.println(student.toString());

        Person anotherStudent = new Student("sania", "choudhry",
                21, address);
// able to create a parent here, which can be dangerous
        // can be ABSTRACTED
        System.out.println(student.toString());


        Lights lights = new Lights();
        Fan fan = new Fan();

        ArrayList<Controls>  controls = new ArrayList<>();
        // as they both implement the controls class

       // alternative way which is easier to the one below
        List<Controls> controlsList = Arrays.asList(lights, fan);

        controls.add(lights);
        controls.add(fan);

        for (Controls controllableItem : controls) {
            controllableItem.switchOn();
            controllableItem.switchOff();
        }

        Tesla car2 = new Tesla("blue", 5, 1.6,
                TransmissionType.MANUAL, "Tesla");

        car2.describe();


    }
    }

    /*    System.out.println(RainbowColours.BLUE.toString());

        System.out.println("colour is " + RED_COLOUR);
     /*   // can be accessed within here as well
        //not best practice above
        // best to use enums
        // special data type allows us to create constants
        // only ever one created

        */

    /* OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.AWAITING_PAYMENT);

     orderProcessor.printOrderMessage();
     orderProcessor.obtainCurrentOrderStatus();

     DogCharacteristics poodle = new DogCharacteristics(DogSize.SMALL);
     poodle.setHungerLevel(100);

     poodle.hungry();

     DogCharacteristics labrador = new DogCharacteristics(DogSize.LARGE);
     labrador.bark();
     // recording at 1.50
        // only use things that are needed when creating objects/ classes
        // such as person would be names, DOB, birth certificate etc
        // no unnecessary things

    Address address = new Address("21 Long lane", "manchester", "M21 321");

    Person person = new Person("John", "Doe", 21, address);
    person.printAddress();
    }
*/

// passed above address into the one below basically OOP.




