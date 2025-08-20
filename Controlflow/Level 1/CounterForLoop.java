package Controlflow;

import java.util.Scanner;

public class CounterForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int count = sc.nextInt();

        for(int i = count ; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}
