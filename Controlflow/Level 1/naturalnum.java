package Controlflow;

import java.util.Scanner;

public class naturalnum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter your num : ");
        int n = sc.nextInt();

        int natural = n * (n + 1) / 2;

        if(n != 0){
            System.out.println("the sum of " + n + " natural num is " + natural);
        }else{
            System.out.println("The number" + n + " is not a natural number");
        }


    }
}
