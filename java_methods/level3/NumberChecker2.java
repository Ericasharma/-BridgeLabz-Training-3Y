import java.util.Arrays;

public class NumberChecker2 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0'; 
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; 

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        int number = 2436; 

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of Digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) { 
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1] + " times");
            }
        }
    }
}
