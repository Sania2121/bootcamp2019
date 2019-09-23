package com.manchesterdigital;

public class Student {

    public static final String CLASS_NAME = "Bootcamp";
    //this is an exmaple of a constant in Java. can only be seen in student class
    // all caps and underscore to separate the words for ease of use and to be able to identify it as a constant
    // be as sensible and as kind as possible when naming them as it helps later on
    //constants usually go at the top


    /// this is an example of an instance variable
    private String studentName;
    //changed this from public to private which means that it is only accessible to me



    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void printDetails() {
        System.out.println("Student's name is " + studentName + "class is " + CLASS_NAME);
        // example of lots of appending in loads of lines
    }

    public static void main(String[] args) {
        Student student = new Student("Pogba");
        student.printDetails();
    }
}
