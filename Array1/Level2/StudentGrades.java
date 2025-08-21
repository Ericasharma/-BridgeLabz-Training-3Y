import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];       
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                int m;
                do {
                    m = sc.nextInt();
                    if (m < 0) {
                        System.out.println("Marks cannot be negative. Enter again:");
                    }
                } while (m < 0);
                marks[i][j] = m;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-10s%n", 
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Remarks");

        for (int i = 0; i < n; i++) {
            String remarks = "";
            switch (grade[i]) {
                case "A": remarks = "Level 4, above standards"; break;
                case "B": remarks = "Level 3, at standards"; break;
                case "C": remarks = "Level 2, below but approaching"; break;
                case "D": remarks = "Level 1, well below standards"; break;
                case "E": remarks = "Level 1-, too below standards"; break;
                case "R": remarks = "Remedial standards"; break;
            }

            System.out.printf("%-10d %-10d %-10d %-12.2f %-10s %-10s%n", 
                              marks[i][0], marks[i][1], marks[i][2], 
                              percentage[i], grade[i], remarks);
        }

        sc.close();
    }
}
