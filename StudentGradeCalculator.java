package guessingGame;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects.");
            return;
        }

        int totalMarks = 0;
        double averagePercentage;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks (out of 100) for subject " + i + ": ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks input. Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        averagePercentage = (double) totalMarks / numSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}


