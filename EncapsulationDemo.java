/*
 * Encapsulation Example in Java
 *
 * Concepts Demonstrated:
 * 1. Private Data Members
 * 2. Public Getter Methods
 * 3. Public Setter Methods
 * 4. Data Hiding
 */

public class EncapsulationDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Sru");
        student.setRollNumber(101);
        student.setGrade("A");

        System.out.println("=== Student Details ===");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());
    }
}

class Student {

    // Private data members
    private String name;
    private int rollNumber;
    private String grade;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }
}
