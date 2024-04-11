import java.util.Scanner;

/**
 * The Student class describes a student/grade for the purposes of CSC14400 Lab 6
 * 
 * @author tlj
 * @version Fall 2022
 */
public class Student {
    private String name; // the student's name
    private int examScore; // the student's exam score

    /**
     * Constructor for the Student class, built from an already constructed Scanner
     * 
     * @param inputStream the scanner from which to read a student.
     */
    public Student(Scanner inputStream) {
        examScore = inputStream.nextInt();
        name = inputStream.nextLine();
    }

    /**
     * Accessor for student name
     * 
     * @return the name of this student
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for the student grade
     * 
     * @return the grade for this student
     */
    public int getScore() {
        return examScore;
    }

    /**
     * Generate a string containing the student name and their score. Remember
     * toString is automatically called from within print methods when an object of
     * type Student is encountered.
     * 
     * @return a String version of this Student
     */
    public String toString() {
        return "" + name + ": " + examScore;
    }
}
