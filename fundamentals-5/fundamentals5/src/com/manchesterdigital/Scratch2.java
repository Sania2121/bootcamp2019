package com.manchesterdigital;

public static void main(String[]args){

        
import org.w3c.dom.ls.LSOutput;

//public class Scratch2 {
    // understanding how to create methods in a non static way

  /*  private int sizeOfDog;
    //member of this class only

    public Scratch2(int sizeOfDog) {
        this.sizeOfDog = sizeOfDog;
        // it constructs something for you ie the dog
        // this refers to the dog instance you are referring to
        // constructor is like a special method

    }

    public String bark() {
        // not static just general one that belongs to only this class. also a member method
        // bark is the name of the method, or also behaviours

        if (sizeOfDog > 60) {
            return "WOOF!";
        } else if (sizeOfDog > 15) {
            return "RUFF!";
        }
        return "YIP!"; */


        Long id;
        try {
            id = Exceptions.convertStringToLong("123");
            System.out.println(id);
        }
        catch(NumberFormatException e) {
            System.err.println("Imput provided was not a valid number " + e);

            id = Long.MAX_VALUE;
        }

    }
// throws is a way of 'passing the book' to someone else
//
