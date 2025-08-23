public class NumberChecker5 {

    public static int sumOfDivisors(int num) {
        int sum = 1; 
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return (num == 1) ? 0 : sum; 
    }

    public static boolean isPerfect(int num) {
        return num > 1 && sumOfDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return num > 1 && sumOfDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return num > 1 && sumOfDivisors(num) < num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 145; 

        System.out.println("Number: " + number);

        System.out.println("Is Perfect Number? " + isPerfect(number));
        System.out.println("Is Abundant Number? " + isAbundant(number));
        System.out.println("Is Deficient Number? " + isDeficient(number));
        System.out.println("Is Strong Number? " + isStrong(number));
    }
}
