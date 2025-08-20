import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        boolean isprime = true;

        if(num <= 0){
            isprime = false;
        }else{
            for(int i = 2 ; i < num ; i++){
                if(num % i == 0){
                    isprime = false;
                }
            }
        }

        if(isprime){
            System.out.println("It is a prime number");
        }else{
            System.out.println("it is no a prime no");
        }
        
    }
}
