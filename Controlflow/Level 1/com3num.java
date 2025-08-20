package Controlflow;

import java.util.Scanner;

public class com3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first num : ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second num : ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third num : ");
        int num3 = sc.nextInt();


        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is largest of all three");
        }else if(num2 > num3 && num1 > num1){
            System.out.println(num2  + " is largest of all three");
        }else if(num3 > num2 && num3 > num1){
            System.out.println(num3 + " is largest of all three");
        }else{
            System.out.println(" ");
        }

    }
}
