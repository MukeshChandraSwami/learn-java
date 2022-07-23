package java14.records;

import java.util.Objects;

/**
 * Record is same as data class type of Kotlin.
 * This feature is introduced to remove the dependency on boilerplate code of DTOs.
 * Like: getter, setter, toString(), hashcode(), equals() etc.
 * Records automatically create all these items internally, except setters (Because of immutability of the object).
 * Only instance variables are included while writing the definition of hashcode(), equals() and toString().
 * Arguments passed in constructor is private and final instance variables.
 * We can not declare instance variables inside the record. Only static variables are allowed.
 * We can create any number of static and non-static methods.
 * We can create one canonical constructor. Canonical constructor means, a constructor who accept all the arguments.
 * Canonical constructor can be converted to Compact form if we are not manipulating data in it.
 */
public record StudentRecord(String name, int rollNum) { // Parametrised constructor

    public static final String SCHOOL = "D.A.V.";

    /*public StudentRecord(String name, int rollNum) {  // Canonical constructor.
        if(Objects.nonNull(name) || rollNum < 1) {
            throw new IllegalArgumentException("Invalid inputs provided.");
        }
        this.name = name;
        this.rollNum = rollNum;
    }*/

    public StudentRecord {  // Canonical constructor compact form.
        if (Objects.nonNull(name) || rollNum < 1) {
            throw new IllegalArgumentException("Invalid inputs provided.");
        }
    }

    public StudentRecord() {    // Default constructor
        this("Anonymous", 1000);
    }

    public StudentRecord(String name, int rollNum, String description) {
        this(name, rollNum);
        System.out.println("Description is: " + description);
    }

    public String getSchool() {
        return SCHOOL;
    }

    public static void main(String[] args) {
        StudentRecord st = new StudentRecord("Rahul", 101);
        System.out.println(st); // toString() method call, automatically provided by JVM.
        System.out.println(st.name()); // Getter method call, automatically provided by JVM.
        System.out.println(st.getSchool()); // Instance method call.
    }
}
