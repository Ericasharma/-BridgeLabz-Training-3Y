import java.util.*;

public class Greatestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();

        int great = 1;

        for(int i = num - 1 ; i >= 1 ; i--){
            if(num % i == 0){
                great = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + num + " beside itself is: " + great);
    }
}
