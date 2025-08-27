import java.util.Scanner;

public class VowelConsonantType {
 
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

  
    public static void displayTypes(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch + " → " + charType(ch));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        displayTypes(text);
    }
}
