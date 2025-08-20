import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight : ");
        int weigth = sc.nextInt();

        System.out.print("Enter height(Cm) : ");
        double height = sc.nextInt();

        double heightcm = height / 100;

        double bmi = weigth / (heightcm * heightcm );

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("Your BMI is: "+ bmi);
        System.out.println("Weight Status: " + status);


    }
}
