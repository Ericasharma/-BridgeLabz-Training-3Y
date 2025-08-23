import java.util.Scanner;

public class LineAndDistance {


    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }


    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] line = new double[2]; 

        if (x1 == x2) {
            System.out.println("The line is vertical, equation: x = " + x1);
            line[0] = Double.POSITIVE_INFINITY;
            line[1] = x1; 
            return line;
        }

        double m = (y2 - y1) / (x2 - x1); 
        double b = y1 - m * x1;            

        line[0] = m;
        line[1] = b;

        return line;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();


        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between points = " + distance);


        double[] line = calculateLineEquation(x1, y1, x2, y2);
        if (line[0] != Double.POSITIVE_INFINITY) {
            System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        }

        sc.close();
    }
}
