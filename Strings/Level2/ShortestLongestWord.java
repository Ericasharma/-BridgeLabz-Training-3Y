import java.util.Scanner;

public class ShortestLongestWord {
   
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

    public static String[] manualSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int index = 0;
        String current = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[index++] = current;
                current = "";
            } else {
                current += ch;
            }
        }
        words[index] = current;
        return words;
    }


    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] wordInfo) {
        String shortest = wordInfo[0][0];
        String longest = wordInfo[0][0];
        int minLen = Integer.parseInt(wordInfo[0][1]);
        int maxLen = minLen;

        for (String[] row : wordInfo) {
            int len = Integer.parseInt(row[1]);
            if (len < minLen) {
                minLen = len;
                shortest = row[0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = row[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] wordInfo = wordWithLengths(words);
        String[] result = findShortestLongest(wordInfo);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
