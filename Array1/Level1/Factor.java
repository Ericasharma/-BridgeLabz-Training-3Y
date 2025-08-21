import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int maxfactor = 10;
        int[] arr = new int[maxfactor];
        int result = 0; 

        for (int i = 1; i <= num; i++) { 
            if (num % i == 0) {
                if (result == maxfactor) {
                    maxfactor *= 2;
                    int[] temp = new int[maxfactor];
                    for (int j = 0; j < result; j++) {
                        temp[j] = arr[j];
                    }
                    arr = temp;
                }
                arr[result] = i;
                result++;
            }
        }

        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
