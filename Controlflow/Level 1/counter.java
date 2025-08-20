package Controlflow;

import java.util.*;

public class counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int count = sc.nextInt();

        int num = 1;

        while(count >= num){
            System.out.println(count);
            count--;
        }


    }
}
