import java.util.*;

public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        if(num < 6 || num > 9){
            System.out.println("Enter num between 6 to 9");
        }else{
            int[] arr = new int[10];

            for (int i = 1; i <= 10; i++) {
                arr[i - 1] = num * i;
            }

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * " + num + " = " + arr[i]);
        
            }
        }
    }
}
