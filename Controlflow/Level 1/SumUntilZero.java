package Controlflow;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        double number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        number = sc.nextDouble();

        double total = 0.0;

        while(number != 0 ){
            total += number;
            System.out.println("enter your number(until it become zero)");
            number = sc.nextDouble();
        }

        System.out.println("Total sum = " + total);
    }
}
