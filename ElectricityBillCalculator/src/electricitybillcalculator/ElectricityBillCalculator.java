/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electricitybillcalculator;

import java.util.Scanner;

/**
 *
 * @author REGIDOR_CPE113
 */
public class ElectricityBillCalculator {

    /**
     * @param args the command line arguments
     */
     public static double calculateConsumptionCharge(double consumption, double rate) {
        return consumption * rate;
    }

    public static double calculateAdditionalCharge(double consumptionCharge, double percentage) {
        return consumptionCharge * (percentage / 100.0);
    }

    public static double calculateTotalBill(double consumptionCharge, double additionalCharge) {
        return consumptionCharge + additionalCharge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Electricity Bill Calculator ===");
        System.out.print("Enter Electricity Consumption (kWh): ");
        double consumption = scanner.nextDouble();

        System.out.print("Enter Rate per kWh (e.g., 12.50): ");
        double rate = scanner.nextDouble();

        double percentage = 5.0; // Additional charge percentage as specified in the test case

        // Method invocations
        double consumptionCharge = calculateConsumptionCharge(consumption, rate);
        double additionalCharge = calculateAdditionalCharge(consumptionCharge, percentage);
        double totalBill = calculateTotalBill(consumptionCharge, additionalCharge);

        // Display results
        System.out.println("-----------------------------------");
        System.out.println("BILLING SUMMARY");
        System.out.println("-----------------------------------");
        System.out.println("Description            | Amount");
        System.out.println("-----------------------------------");
        System.out.printf("Consumption Charge     | P%,.2f\n", consumptionCharge);
        System.out.printf("Additional Charge  | P%,.2f\n", additionalCharge);
        System.out.printf("Total Electricity Bill | P%,.2f\n", totalBill);
        System.out.println("-----------------------------------");

        scanner.close();
    }
}
   
   