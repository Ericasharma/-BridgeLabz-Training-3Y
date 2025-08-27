import java.util.Scanner;

public class CharFrequency {

    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);     
                result[index][1] = String.valueOf(freq[c]); 
                freq[c] = 0; 
                index++;
            }
        }

        return result;
    }

    public static void displayFrequency(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findCharFrequency(input);

        displayFrequency(result);

        sc.close();
    }
}
