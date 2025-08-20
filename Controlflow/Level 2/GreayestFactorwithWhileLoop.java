import java.util.Scanner;

public class GreayestFactorwithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();

        int great = 1;

        int i = num - 1 ;

        while( i >= 1 ){
            if(num % i == 0){
                great = i;
                
                break;
                
            }
            i--;
        }

        System.out.println("The greatest factor of " + num + " beside itself is: " + great);
    }
}
