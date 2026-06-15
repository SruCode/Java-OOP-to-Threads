/*
 * Constructor Example in Java
 *
 * Concepts Demonstrated:
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Constructor Overloading
 * 4. Use of 'this' Keyword
 */

public class ConstructorDemo {

    public static void main(String[] args) {

        System.out.println("=== Default Constructor ===");
        Student student1 = new Student();
        student1.displayDetails();

        System.out.println("\n=== Parameterized Constructor ===");
        Student student2 = new Student("Sru", 101, 18, "A");
        student2.displayDetails();
    }
}

class Student {

    private String name;
    private int rollNumber;
    private int age;
    private String grade;

    // Default Constructor
    public Student() {
        this.name = "Not Assigned";
        this.rollNumber = 0;
        this.age = 0;
        this.grade = "Not Assigned";
    }

    // Parameterized Constructor
    public Student(String name, int rollNumber, int age, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}