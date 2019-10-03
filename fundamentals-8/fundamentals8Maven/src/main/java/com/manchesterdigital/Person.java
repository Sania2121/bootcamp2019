package com.manchesterdigital;

public abstract class  Person {
    // now treated as an abstract which means you can no longer create an instance of a person
    // not visible to the world anymore
    // can still make new student even though it expands from here

    private final String firstName;
    private final String lastName ;
    private final Integer age;
    private final Address address;
    // we wrapped the entire address in its own class
    // final means you cant change it. even through a setter it will give an error
    // one way street
    // if it needs to be changed then don't make it final


    public Person(String firstName, String lastName, Integer age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;

    }

    public abstract void haveLunch();
    // abstract method
    // has to be implemented by the sub classes
    // will have to be implemented all the way down the extension tree

        public final String sayHello() {
            return "Hello";

    }


    public void printAddress(){
        System.out.println(address.toString());
        // because to string has not been implemented yet,
        // cmd n on address class and did tostring to solve above issue
        // did it under the constructor
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    // constructor selects all as it gets that it needs everything for a person to exist
} // simplistic example above
// recording at around 2.05
