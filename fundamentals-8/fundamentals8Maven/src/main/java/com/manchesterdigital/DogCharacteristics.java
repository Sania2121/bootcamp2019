package com.manchesterdigital;

public class DogCharacteristics {

    private String breed;
    private Integer weight;
    private String eyeColour;
    private Integer age;

    // member fields/variables of a class that belomng only to this class


    private Integer aggressionLevel;
    private DogSize dogSize;
    // went red then clicked light bul to create dogsize enum
    // no longer complains
    private Integer hungerLevel;


    public DogCharacteristics(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark() {
        System.out.println(dogSize.getNoise());
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }


    public void hungry() {
        if (hungerLevel > 10) {
            for (int i = 0; i < 10; i++) {
                bark();

            }


            System.out.println("Gimmeee food!" +  dogSize.getNoise() );
        } else {
            System.out.println("I am stuffed");
        }
    }
    // form of a behaviour
    // should go through the enum and bring back the noise of the dog depending on size
// defined a brak functiomn that can be called in the outside world as well as our functions



    }


