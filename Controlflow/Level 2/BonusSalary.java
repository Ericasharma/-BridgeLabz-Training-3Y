import java.util.*;

public class BonusSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salaray : ");
        double salaray = sc.nextInt();

        System.out.print("Enter your working year : ");
        double year = sc.nextInt();

        double bonus = salaray * 0.05;

        if(year > 5){
            double total = bonus + salaray;
            System.out.println("your bonus is " + bonus + "and your final salaray is " + total );
        }else{
            System.out.println("You are not eligible for bonus");
        }
    }

}
