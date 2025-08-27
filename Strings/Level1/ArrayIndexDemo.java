import java.util.Scanner;

public class ArrayIndexDemo {
    
    public static void generateException(String[] names) {
        // Access invalid index
        System.out.println(names[names.length]); 
    }
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        handleException(names);

        sc.close();
    }
}

