package Controlflow;

import java.util.*;

public class SumuntilzerorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) { 
            System.out.print("enter your number (until it became zero : ");
            double count = sc.nextDouble();

            if(count <= 0){
                break;
            }

            total += count;
        }

        System.out.println(total);
    }
}
