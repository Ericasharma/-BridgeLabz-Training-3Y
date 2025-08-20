package Controlflow;

import java.util.*;

public class Comparenaturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num : ");
        int num = sc.nextInt();

        int naturalnum = num * ( num + 1) / 2;

        int total = 0;
        int i = 1;

        while(i <= num){
            total += i;
            i++;
        }

        if(naturalnum == total){
            System.out.println("the result is "+ total);
        }else{
            System.out.println("Not same");
        }
    }


    
}
