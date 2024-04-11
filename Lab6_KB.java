import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab6_KB {
    public static void main(String[] args) {
        try {
            // File Dialogue handling GUI with Try/Catch
            File myFile = new File("C:\\Users\\User\\Downloads\\Lab6in7.txt");
            Scanner scanner = new Scanner(myFile);

            // Instantiate/Construct a new student called maxStudent
            Student maxStudent = new Student(new Scanner(scanner.nextLine()));

            // Declare another student called minStudent = maxStudent
            Student minStudent = maxStudent;

            // Declare an integer called sum, give it the value from the getScore method in Student
            int sum = maxStudent.getScore();

            // Declare an integer called numStudents, initialize to 1
            int numStudents = 1;

            // In a while loop (while(scanner.hasNext()))
            while (scanner.hasNext()) {
                // Read in a student
                Student current = new Student(scanner);

                // Check scores and set minStudent and maxStudent accordingly
                if (current.getScore() > maxStudent.getScore()) {
                    maxStudent = current;
                }
                if (current.getScore() < minStudent.getScore()) {
                    minStudent = current;
                }

                // Add to the sum
                sum += current.getScore();

                // Increment numStudents
                numStudents++;
            }

            // Calculate the average
            float average = (float) sum / numStudents;

            // Print min and max students
            System.out.printf("The average score was: " + "%.3f%n", average);
            System.out.println("The best student was " + maxStudent.getName() + " Score: " + maxStudent.getScore());
            System.out.println("The worst student was " + minStudent.getName() + " Score: " + minStudent.getScore());
            
            // Close scanner and dispose file dialogue
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
