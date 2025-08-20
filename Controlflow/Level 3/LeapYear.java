import java.util.*;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        if(year < 1582){
            System.out.println("year which is lesser than 1582 in not in leap year according to Gregorian calendar");
        }

        if(year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else if(year % 100 != 0){
            System.out.println(year + " is not a leap year");
        }else if(year % 4 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}