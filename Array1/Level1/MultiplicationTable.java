import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int[] result = new int[11];

        for(int i = 1 ; i < result.length ; i++){
            result[i] = i * num;
            System.out.println(i + " * " + num + " = " + result[i]);
        }
    }
}
