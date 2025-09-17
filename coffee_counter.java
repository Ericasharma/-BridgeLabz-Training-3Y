// The Coffee Counter Chronicles ☕
//Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
//that:
//Asks for coffee type (switch)
//Calculates total bill (price * quantity)
//Adds GST using arithmetic operators
//Use while to continue for the next customer and break when "exit" is typed.

import java.util.Scanner;

public class coffee_counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gstRate = 0.18; 

        while (true) {
            
            System.out.println("Enter coffee type (espresso/latte/cappuccino/exit): ");
            String coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Cafe closing... Goodbye! 👋");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
          
            double pricePerCup;
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 100;
                    break;
                case "latte":
                    pricePerCup = 120;
                    break;
                case "cappuccino":
                    pricePerCup = 150;
                    break;
                default:
                    System.out.println("Sorry, we don’t serve that coffee.");
                    continue;
            }

            double total = pricePerCup * quantity;
            double gst = total * gstRate;
            double finalBill = total + gst;

            System.out.println("\nBill");
            System.out.println("Coffee: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total (before GST):" + total);
            System.out.println("GST (18%):" + gst);
            System.out.println("Final Bill:" + finalBill);
            
        }

        sc.close();
    }
}
