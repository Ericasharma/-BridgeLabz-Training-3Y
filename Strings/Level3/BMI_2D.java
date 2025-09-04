import java.util.Scanner;

public class BMI_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // 2D array: [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input loop
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Weight input (positive only)
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            // Height input (positive only)
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (height <= 0);

            // Store weight & height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double cal = weight / (height * height);
            personData[i][2] = cal;

            // Determine weight status
            if (cal < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (cal < 25) {
                weightStatus[i] = "Normal";
            } else if (cal < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-12s %-12s %-8s %-15s%n", "Person", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-8.2f %-15s%n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
