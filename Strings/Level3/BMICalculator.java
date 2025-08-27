import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] computeAllBMI(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4]; 

        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0]; 
            result[i][3] = bmiData[1]; 
        }

        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][2]; 


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        String[][] result = computeAllBMI(personData);

        displayTable(result);

        sc.close();
    }
}
