import java.util.Arrays;

public class NumberChecker3 {

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

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }


    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }


    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }


    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.indexOf('0') > 0; 
    }


    public static void main(String[] args) {
        int number = 12321; 

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of Digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Are original and reversed arrays equal? " + compareArrays(digits, reversed));

        System.out.println("Is Palindrome? " + isPalindrome(number));

        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}

