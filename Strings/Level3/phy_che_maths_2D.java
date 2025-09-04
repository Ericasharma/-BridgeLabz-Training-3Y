import java.util.Scanner;

public class phy_che_maths_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [row=student][col=subject]
        double[] percentage = new double[n];
        String[] grades = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Physics
            while (true) {
                System.out.print("Enter Physics marks: ");
                int p = sc.nextInt();
                if (p >= 0) {
                    marks[i][0] = p;
                    break;
                } else {
                    System.out.println("Not a valid mark!");
                }
            }

            // Chemistry
            while (true) {
                System.out.print("Enter Chemistry marks: ");
                int c = sc.nextInt();
                if (c >= 0) {
                    marks[i][1] = c;
                    break;
                } else {
                    System.out.println("Not a valid mark!");
                }
            }

            // Maths
            while (true) {
                System.out.print("Enter Mathematics marks: ");
                int m = sc.nextInt();
                if (m >= 0) {
                    marks[i][2] = m;
                    break;
                } else {
                    System.out.println("Not a valid mark!");
                }
            }

            // Percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Grade
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

        // Output
        System.out.println("\n--- Result ---");
        System.out.printf("%-8s %-8s %-10s %-8s %-12s %-6s%n",
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-8d %-10d %-8d %-12.2f %-6s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grades[i]);
        }

        sc.close();
    }
}