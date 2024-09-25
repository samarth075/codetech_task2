import java.util.Scanner;

public class StudentGradeTracker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Array to store grades for each subject
        double[] grades = new double[numSubjects];
        double total = 0;

        // Input grades for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }

        // Calculate average grade
        double average = total / numSubjects;

        // Determine letter grade based on the average
        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Calculate GPA on a 4.0 scale
        double gpa;
        if (average >= 90) {
            gpa = 4.0;
        } else if (average >= 80) {
            gpa = 3.0;
        } else if (average >= 70) {
            gpa = 2.0;
        } else if (average >= 60) {
            gpa = 1.0;
        } else {
            gpa = 0.0;
        }

        // Display the results
        System.out.println("\n--- Grade Summary ---");
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("GPA: " + gpa);

        // Close the scanner
        scanner.close();}
}
