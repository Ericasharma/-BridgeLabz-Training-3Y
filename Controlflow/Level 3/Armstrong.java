import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;

        int originalnum = num;

        while (originalnum != 0) {
            int digit = originalnum % 10;
            sum += digit * digit * digit;
            originalnum = originalnum / 10;
        }

        if (num == sum) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }
    }
}
