
import java.util.Scanner;

public class EvenOddPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you num : ");
        int num = sc.nextInt();

        int[] even = new int[num/2 + 1];
        int evenindex = 0;

        int[] odd = new int[num/2 + 1];
        int oddindex = 0;

        if(num <= 0){
            System.out.println("input number which is greater than 0 ");
            return;
        }
        
        for(int i = 1 ; i <=num ; i++){
            if(i % 2 == 0){
                even[evenindex] = i;
                evenindex++;
            }else{
                odd[oddindex] = i;
                oddindex++;
            }
                
        }

        System.out.println("Even Number :- ");
        for(int i = 0 ; i <evenindex ; i++){
            System.out.println(even[i] + " " );
        }


        System.out.println("Odd Numbers :- ");
        for(int i = 0 ; i < oddindex ; i++){
            System.out.println(odd[i] + " " );
        }



    }
}
