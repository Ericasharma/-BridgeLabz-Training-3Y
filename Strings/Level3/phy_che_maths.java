import java.util.Scanner;
public class phy_che_maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int n=sc.nextInt();        
        int []phy=new int[n];
        int []che=new int[n];
        int[]maths=new int[n];
        double[] percentage = new double[n];
        String[]grades=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Student"+(i+1));
            
            while (true) { 
                System.out.print("Enter physics marks: ");
                int p=sc.nextInt();
                if(p>=0){
                    phy[i]=p;
                    break;
                }
                else{
                    System.out.println("not a valid marks");
                }
            }

             while (true) { 
                System.out.print("Enter chemistry marks: ");
                int c=sc.nextInt();
                if(c>=0){
                    che[i]=c;
                    break;
                }
                else{
                    System.out.println("not a valid marks");
                }
            }

             while (true) { 
                System.out.print("Enter mathematics marks: ");
                int m=sc.nextInt();
                if(m>=0){
                    maths[i]=m;
                    break;
                }
                else{
                    System.out.println("not a valid marks");
                }
            }
            percentage[i] = (phy[i] + che[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80) {
                grades[i] = "Grade A";
            } else if (percentage[i] >= 70) {
                grades[i] = "Grade B";
            } else if (percentage[i] >= 60) {
                grades[i] = "Grade C";
            } else if (percentage[i] >= 50) {
                grades[i] = "Grade D";
            } else if (percentage[i] >= 40) {
                grades[i] = "Grade E";
            } else {
                grades[i] = "Grade F";
            }
        }
         System.out.println("\n--- Result ---");
        System.out.printf("%-8s %-8s %-10s %-8s %-12s %-6s%n",
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-8d %-10d %-8d %-12.2f %-6s%n",
                    (i + 1), phy[i], che[i], maths[i], percentage[i], grades[i]);
        }
        sc.close();
    }
}