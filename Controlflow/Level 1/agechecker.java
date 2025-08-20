package Controlflow;

import java.util.Scanner;

public class agechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int num1 = sc.nextInt();


        if(num1 < 18){
            System.out.println("you are not eligible for vote");
        }else if(num1 == 18 || num1 > 18){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("Ivalid number");
        }
    }
}
