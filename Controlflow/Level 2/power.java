import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();


        System.out.print("Enter power : ");
        int pow = sc.nextInt();

        if(num <= 0 || pow < 0){
            System.out.println("Enter a valid number");
        }

        int result = 1;

        for(int i = 1 ; i <= pow ; i++){
            result *= num;
        }

        System.out.println(result);
    }
}
