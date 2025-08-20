import java.util.Scanner;

public class FactorwithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        double num = sc.nextDouble();

        int i = 1 ;
        while( i <= num){
            if(num % i == 0){
                System.out.println("Divisible by " + i);
            }else{
                System.out.println("Not Divisible by " + i);
            }
            i++;
        }
    }
}
