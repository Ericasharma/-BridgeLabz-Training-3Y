import java.util.Scanner;

public class ToCharArrayCheck {
    
    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] myChars = getChars(text);
        char[] builtInChars = text.toCharArray();

        System.out.println("Characters using charAt(): " + String.valueOf(myChars));
        System.out.println("Characters using toCharArray(): " + String.valueOf(builtInChars));
        System.out.println("Both are equal: " + compareArrays(myChars, builtInChars));
        sc.close();
    }
}
