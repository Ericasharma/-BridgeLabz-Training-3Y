import java.util.*;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ypur number : ");
        int num = sc.nextInt();

        if( num <= 0 || num >= 100){
            System.out.println("Enter a postive number");
        }
        else{
            for(int i = 100 ; i >= 1 ; i--){
                if( num % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
