package Controlflow;

import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int fact = 1;
        if(num == 0){
            System.out.print("it can not be defined ");
        }else{
            for(int i = 1; i < num ; i++){
                fact *= i;
            }
            System.out.println("Factorial of " + num + " = " + fact);
        }

    }
}
