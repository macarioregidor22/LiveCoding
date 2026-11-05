/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StudentGradeEvaluator;

import java.util.Scanner;

/**
 *
 * @author REGIDOR_CPE113
 */

    /**
     * @param args the command line arguments
     */
    
public class StudentGradeEvaluator {

    public static double calculateAverage(double prelim, double midterm, double finals) {
        return (prelim + midterm + finals) / 3.0;
    }

    public static char getGradeEquivalent(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 85) {
            return 'B';
        } else if (average >= 80) {
            return 'C';
        } else if (average >= 75) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static boolean isPassed(double average) {
        return average >= 75.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Evaluator ===");
        System.out.print("Enter Prelim Grade: ");
        double prelim = scanner.nextDouble();

        System.out.print("Enter Midterm Grade: ");
        double midterm = scanner.nextDouble();

        System.out.print("Enter Final Grade: ");
        double finals = scanner.nextDouble();

        // Method invocations
        double average = calculateAverage(prelim, midterm, finals);
        char gradeEquivalent = getGradeEquivalent(average);
        boolean passed = isPassed(average);

        // Display results
        System.out.println("-----------------------------------");
        System.out.println("EVALUATION RESULT");
        System.out.println("-----------------------------------");
        System.out.printf("Average Score:     %.2f\n", average);
        System.out.printf("Grade Equivalent:  %c\n", gradeEquivalent);
        System.out.printf("Academic Status:   %s\n", (passed ? "Passed" : "Failed"));
        System.out.println("-----------------------------------");

        scanner.close();
    }
}

