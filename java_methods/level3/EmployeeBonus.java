import java.util.Random;

public class EmployeeBonus {


    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = rand.nextInt(11); 
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] oldData) {
        int n = oldData.length;
        double[][] newData = new double[n][4]; 

        for (int i = 0; i < n; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            newData[i][0] = salary;
            newData[i][1] = years;
            newData[i][2] = bonus;
            newData[i][3] = newSalary;
        }
        return newData;
    }

    public static void displayTable(double[][] data) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-12s %-10s %-12s %-12s\n", 
                          "ID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-5d %-12.0f %-10.0f %-12.2f %-12.2f\n", 
                              (i+1), data[i][0], data[i][1], data[i][2], data[i][3]);
            totalOldSalary += data[i][0];
            totalNewSalary += data[i][3];
            totalBonus += data[i][2];
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-5s %-12.0f %-10s %-12.2f %-12.2f\n", 
                          "TOT", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData(10);
        double[][] result = calculateBonusAndNewSalary(employees);
        displayTable(result);
    }
}

