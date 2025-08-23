import java.util.Arrays;

public class FactorChecker {

    public static int[] findFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }


    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static long productOfCubes(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= (long) Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        int number = 12; 

        System.out.println("Number: " + number);

        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        int greatest = greatestFactor(factors);
        System.out.println("Greatest Factor: " + greatest);

        int sum = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sum);

        long product = productOfFactors(factors);
        System.out.println("Product of Factors: " + product);

        long productCubes = productOfCubes(factors);
        System.out.println("Product of Cubes of Factors: " + productCubes);
    }
}
