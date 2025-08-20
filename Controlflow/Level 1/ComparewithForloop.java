package Controlflow;

import java.util.Scanner;

public class ComparewithForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num : ");
        int num = sc.nextInt();

        int naturalnum = num * ( num + 1) / 2;

        int total = 0;

        
        for(int i = 1 ; i <= num ; i++){
            total += i;
        }

        if(naturalnum == total){
            System.out.println("the result is "+ total);
        }else{
            System.out.println("Not same");
        }
    }
}
