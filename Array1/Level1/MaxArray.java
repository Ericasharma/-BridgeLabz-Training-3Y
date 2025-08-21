import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] num = new double[10];

        double total = 0.0;
        int index = 0;

        


        while (true) { 
            System.out.print("Enter number " + (index + 1) + ": ");
            double userEntry = sc.nextDouble();

            if (userEntry <= 0) {
                System.out.println("Stopping input as a non-positive number was entered.");
            }

            num[index] = userEntry;
            index++;


            if (index == 10) { 
                System.out.println("Maximum numbers (10) reached. Stopping input.");
                break;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + num[i]);
            total += num[i];
        }

        System.out.println("Total count of numbers entered: " + index);
        System.out.println("Sum of all numbers: " + total);
        
              
    }
}
