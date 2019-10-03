package com.manchesterdigital;

public class Student extends Person {

    private String universityName;

    public Student(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void haveLunch() {
        System.out.println("has lunch at 12");
        // trying to override parent behaviour
        // was enforced to bring in the lunch thing but as above can be overridden

    }
    // extends will be used here to inherit from person class (look at top class bit)

    // to make university required, can use setter, add to constructor, or make it final


    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
      StringBuilder out = new StringBuilder();

      out.append("University name: ");
        out.append(universityName);
        out.append("\n");

        out.append("Person: ");
        out.append(getAge());
        // set a getter on person, then set toString and then called it here.
        // could also make it protected which would allow access but protect it


      return out.toString();
    }


}
