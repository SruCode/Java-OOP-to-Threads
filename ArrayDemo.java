/*
 * Array Implementation in Java
 *
 * Concepts Demonstrated:
 * 1. One-Dimensional Array
 * 2. Two-Dimensional Array
 * 3. Array of Objects
 * 4. Object Creation
 * 5. Array Traversal using Loops
 */

public class ArrayDemo {

    public static void main(String[] args) {

        // -------------------------
        // 1D Array
        // -------------------------
        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("=== One-Dimensional Array ===");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\n");

        // -------------------------
        // 2D Array
        // -------------------------
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("=== Two-Dimensional Array ===");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // -------------------------
        // Array of Objects
        // -------------------------
        Student[] students = {
                new Student("Sru", 101),
                new Student("Aarav", 102),
                new Student("Diya", 103)
        };

        System.out.println("=== Array of Objects ===");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}

// Student Class
class Student {

    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println(
                "Name: " + name +
                ", Roll Number: " + rollNumber
        );
    }
}