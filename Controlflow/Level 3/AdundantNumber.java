import java.util.*;

public class AdundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your num : ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1 ; i < num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(num < sum){
            System.err.println("it is a adundant number");
        }else{
            System.out.println("Its is not a Adundant number");
        }
    }
}
