
import java.util.Scanner;

public class BMICalculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of employees: ");
        int person=sc.nextInt();
        double [] weight= new double[person];
        double [] height= new double[person];  
        double [] BMI= new double[person]; 
        String [] BMI_S= new String[person];   
        for(int i=0;i<person;i++){
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("enter your weight");
            double w=sc.nextDouble();
            weight[i]=w;
            System.out.println("enter your height");
            double h=sc.nextDouble();
            height[i]=h;
            double cm=100*h;
            double cal= w / (h * h);
           
            BMI[i]=cal;
            if(cal>=18.4){
                BMI_S[i]="underweight";
            }
            else if(cal<25){
                BMI_S[i]=("Normal");
            }
            else if(cal<30){
                BMI_S[i]=("overweight");
            }
            else{
                BMI_S[i]=("obese");
            }
        }
        for(int i=0;i<person;i++){
            System.out.println("\n Results");
              System.out.printf("%-10d %-12.2f %-12.2f %-8.2f %-15s%n",
                    (i+1), height[i], weight[i], BMI[i], BMI_S[i]);
        }
        sc.close();
    }
}
