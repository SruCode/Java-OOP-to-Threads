/*
 * Basic Class and Object Example in Java
 *
 * Concepts Demonstrated:
 * 1. Class
 * 2. Object
 * 3. Instance Variables
 * 4. Methods
 * 5. Object Creation
 * 6. Accessing Data Members
 * 7. Method Invocation
 */

public class ClassAndObjectDemo {

    public static void main(String[] args) {

        // Creating an object
        Student student1 = new Student();

        // Assigning values to instance variables
        student1.name = "Sru";
        student1.rollNumber = 101;
        student1.age = 18;

        // Calling methods
        student1.displayDetails();
        student1.study();
    }
}

// Class Definition
class Student {

    // Instance Variables
    String name;
    int rollNumber;
    int age;

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }

    // Method representing behavior
    void study() {
        System.out.println(name + " is studying Java.");
    }
}