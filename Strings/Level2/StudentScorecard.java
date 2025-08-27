import java.util.Scanner;

public class StudentScorecard {

    public static int[][] generateMarks(int numStudents) {
        int[][] marks = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 40 + (int) (Math.random() * 61); 
            }
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; 
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        int numStudents = results.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f %-10s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = generateMarks(numStudents);
        double[][] results = calculateResults(marks);
        String[] grades = calculateGrades(results);

        displayScorecard(marks, results, grades);
    }
}
