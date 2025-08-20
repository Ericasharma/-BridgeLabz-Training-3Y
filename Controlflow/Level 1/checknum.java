package Controlflow;

import java.util.*;

public class checknum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your frist num : ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second num : ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third num : ");
        int num3 = sc.nextInt();


        if(num1 < num2 && num1 < num3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
