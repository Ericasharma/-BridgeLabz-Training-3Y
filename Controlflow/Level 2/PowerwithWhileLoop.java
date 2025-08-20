import java.util.Scanner;

public class PowerwithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int i = 1 ;


        System.out.print("Enter power : ");
        int pow = sc.nextInt();

        if(num <= 0 || pow < 0){
            System.out.println("Enter a valid number");
        }

        int result = 1;

        while( i <= pow ){
            result *= num;
            i++;
        }

        System.out.println(result);
    }
}
