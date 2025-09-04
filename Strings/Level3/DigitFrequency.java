import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        if (num < 0) {
            num = -num;
        }
        String numStr = Long.toString(num);
        int length = numStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0'; 
        }
        int[] freq = new int[10];
        for (int i = 0; i < length; i++) {
            freq[digits[i]]++;
        }
        System.out.println("\nDigit Frequency in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " → " + freq[i] + " time(s)");
            }
        }
        sc.close();
    }
}
