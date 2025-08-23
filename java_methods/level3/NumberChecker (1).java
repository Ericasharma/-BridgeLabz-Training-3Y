import java.util.Arrays;

public class NumberChecker {

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



    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.indexOf('0') > 0; 
    }

    public static boolean isArmstrongNumber(int num) {
        int[] digits = getDigitsArray(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; 

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of Digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        int[] largestPair = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestPair[0] + ", Second Largest: " + largestPair[1]);

        int[] smallestPair = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestPair[0] + ", Second Smallest: " + smallestPair[1]);
    }
}
