package com.manchesterdigital;

public class BakingExample {
    public static void main(String[] args) {
        switchOvenOn(3);

    }

    protected void decorate() {
        System.out.println("Decorating cake...");
        /* cannot be called anywhere in the class as it has no instance and not static
    */
        // if it protected though it can be called but only using a lower case
        // method belongs to the object
        // static should just be for throwaway things
        // do not use static for important thing as it may lead to deadlock
    }


    protected static int switchOvenOn(int setting) { //method name should be your intention
        System.out.println("Setting oven on to level " + setting);

        int minutesToCook = 0;
        switch (setting) {
            case 1:
                System.out.println("Set to level 1");
                minutesToCook += 20;
                break;
            case 2:
                System.out.println("Set to level 2");
                minutesToCook += 30;
                break;
            case 3:
                System.out.println("Set to level 3");
                minutesToCook += 40;
                break;
            case 4:
                System.out.println("Set to level 4");
                minutesToCook += 50;
                break;
            case 5:
                System.out.println("Set to level 5");
                minutesToCook += 60;
                break;
            default:
                System.out.println("Oven is off");

        }

        return minutesToCook;

    }

    private static void produceMixture(){
        System.out.println("Mixing.....");
    }


}// exit point is the return line for the method to return something back out

/*
SRP single responsibility principle
your method should only do one thing and do this one thing well. dont add any extra logic into your method.
needs to be explicitly clear
 */