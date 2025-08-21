import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your numbers : ");

        int[] numbers = new int[5];

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = sc.nextInt();
        }


        for(int i = 0 ; i <numbers.length ; i++){

            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }


        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        
        System.out.println("\nComparison of first and last elements:");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to Last element (" + last + ")");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than Last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than Last element (" + last + ")");
        }

        

    }
}
