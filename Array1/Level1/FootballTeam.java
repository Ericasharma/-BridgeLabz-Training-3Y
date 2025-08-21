
import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of team player : ");

        double[] arr = new double[11];

        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = sc.nextDouble();
        } 

        double result = 0.0;

        for(int i = 1 ; i < arr.length ; i++){
            result += arr[1];
        }

        double mean = result / 11;

        System.out.println("The mean heigth of the team is = " + mean);
    }


}
