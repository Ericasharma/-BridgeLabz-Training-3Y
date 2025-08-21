import java.util.*;

public class BonusSalaray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] year = new double[10];


        for(int i = 0 ; i < 10 ; i++){
            System.out.print("Enter employee no " + (i+ 1) + " salary :- ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter working year of employee no " + (i + 1 ) + ":- ");
            year[i] = sc.nextDouble();

        }
 

        for(int i = 0 ; i < 10 ; i++){
            double bonus = salary[i] * 0.05;
            double bonus2 = salary[i] * 0.02;
            double total = bonus + salary[i];
            double total2 = bonus2 + salary[i];
            if(year[i] >= 5){
                System.out.println("employee no "+ (i + 1 )  + " you bonus is " + bonus + "  and your final salary is " + total);
            }else if(year[i]  < 5){
                System.out.println("employee no "+ i + " you bonus is " + bonus2 + " and your final salary is " + total2);
            }else{
                System.out.println("you will not get any bonus");
            }

        }

    }
}