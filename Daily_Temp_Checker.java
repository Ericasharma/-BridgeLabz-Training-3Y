// Daily Temperature Tracker 🌡️
// A weather app stores the temperature of 7 days in an array.
// Use a for loop to calculate the average temperature.
// Find the highest and lowest temperature of the week.
// Display all temperatures above the weekly average.

import java.util.Scanner;

public class Daily_Temp_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 7;
        double[] temps = new double[days];

        System.out.println("Enter Temperatures for 7 days:");
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temps[i] = sc.nextDouble();
        }

        
        double sum = 0;
        for (int i = 0; i < days; i++) {
            sum += temps[i];
        }
        double avg = sum / days;

        
        double highest = temps[0];
        double lowest = temps[0];
        for (int i = 1; i < days; i++) {
            if (temps[i] > highest) highest = temps[i];
            if (temps[i] < lowest) lowest = temps[i];
        }

        
        System.out.println("\nAverage Temperature: " + avg);
        System.out.println("Highest Temperature: " + highest);
        System.out.println("Lowest Temperature: " + lowest);

        System.out.println("Temperatures above average:");
        for (int i = 0; i < days; i++) {
            if (temps[i] > avg) {
                System.out.println("Day " + (i + 1) + ": " + temps[i]);
            }
        }

        sc.close();
    }
}
