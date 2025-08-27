import java.util.Scanner;

public class WordLengthDemo {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    
    public static String[][] splitWithLengths(String text) {
        int length = findLength(text);
        String[] words = text.split(" "); // quick split
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[][] wordInfo = splitWithLengths(text);

        System.out.println("Word\tLength");
        for (String[] row : wordInfo) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
