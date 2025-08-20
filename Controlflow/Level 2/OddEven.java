package Level2;


import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num :");
        int num = sc.nextInt();

        for(int i = 0 ; i <= num ; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is odd");

            }
        }
    }
}
