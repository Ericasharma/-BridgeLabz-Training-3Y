import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you number : ");
        int num = sc.nextInt();

        int sum = 0;

        int originalnum = num;

        while (num > 0) {
            int digit = num % 10;   
            sum += digit;              
            num = num / 10;      
        }

        if (originalnum % sum == 0) {
            System.out.println(originalnum + " is a Harshad Number.");
        } else {
            System.out.println(originalnum + " is NOT a Harshad Number.");
        }
    }
}
