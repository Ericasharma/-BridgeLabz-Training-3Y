import java.util.Random;

public class FootballTeamHeights {
    
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); 
        }
        return heights;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    public static double calculateMean(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.print("Players' Heights (cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Total Sum of Heights: " + sum);
        System.out.println("Mean Height: " + mean);
        System.out.println("Shortest Height: " + shortest);
        System.out.println("Tallest Height: " + tallest);
    }
}
