import java.util.Scanner;

public class NumberPointerDemo {
   
    public static void generateException(String text) {
       
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to convert: ");
        String text = sc.nextLine();

     
        handleException(text);
        sc.close();
    }
}
