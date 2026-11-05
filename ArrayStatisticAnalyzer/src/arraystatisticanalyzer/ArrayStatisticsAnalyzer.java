/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraystatisticanalyzer;

/**
 *
 * @author REGIDOR_CPE113
 */

import java.util.Scanner;

public class ArrayStatisticsAnalyzer {

    public static int calculateSum(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }

    public static double calculateAverage(int[] scores) {
        if (scores.length == 0) return 0.0;
        return (double) calculateSum(scores) / scores.length;
    }

    public static int findHighest(int[] scores) {
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        return highest;
    }

    public static int findLowest(int[] scores) {
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        return lowest;
    }

    public static int countPassing(int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score >= 75) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Array Statistics Analyzer ===");
        System.out.print("Enter total number of scores: ");
        int n = scanner.nextInt();

        // Validate that the array is not empty
        if (n <= 0) {
            System.out.println("Error: The array cannot be empty.");
            scanner.close();
            return;
        }

        int[] scores = new int[n];
        System.out.println("Enter the scores one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Method invocations
        int totalScores = scores.length;
        int sum = calculateSum(scores);
        double average = calculateAverage(scores);
        int highest = findHighest(scores);
        int lowest = findLowest(scores);
        int passingCount = countPassing(scores);

        // Display results
        System.out.println("\n-------------------------------------");
        System.out.println("STATISTICAL INFORMATION");
        System.out.println("-------------------------------------");
        System.out.printf("Total Number of Scores       | %d\n", totalScores);
        System.out.printf("Sum of Scores                | %d\n", sum);
        System.out.printf("Average Score                | %.3f\n", average);
        System.out.printf("Highest Score                | %d\n", highest);
        System.out.printf("Lowest Score                 | %d\n", lowest);
        System.out.printf("Number of Passing Students   | %d\n", passingCount);
        System.out.println("-------------------------------------");

        scanner.close();
    }
}