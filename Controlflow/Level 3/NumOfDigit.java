import java.util.*;

public class NumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int count = 0;

        int originalnum = num;

        while (num != 0) {
            num = num / 10;  
            count++;              
        }

        if(originalnum == 0){
            count = 1;
        }

        System.out.println(count);


    }
}
