package Controlflow;

import java.util.*;

public class springseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter month : ");
        int month = sc.nextInt();

        System.out.print("enter date : ");
        int date = sc.nextInt();

        boolean isSpring = false;

        if(month == 3 && date >= 20 && date <= 31){
            isSpring = true;
        }else if (month == 4 && date >= 1 && date <= 30) {
            isSpring = true;
        }else if (month == 5 && date >= 1 && date <= 31) {
            isSpring = true;
        }else if (month == 6 && date >= 1 && date <= 20) {
            isSpring = true;
        }

        if(isSpring){
            System.out.println("It is a Spring Season");
        }else{
            System.out.println("not a spring season");
        }
    }
}
