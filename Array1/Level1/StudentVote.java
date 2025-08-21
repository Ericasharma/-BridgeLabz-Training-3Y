import java.util.*;

public class StudentVote{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you array : ");
        int[] ages = new int[10];

        for(int i = 0 ; i < ages.length ; i++){
            ages[i] = sc.nextInt();
        }

        for(int i = 0 ; i < ages.length ; i++){
            System.out.print(ages[i] + " ");

            if(ages[i] > 18){
                System.out.println("you can vote");
            }else{
                System.out.println("you can not vote");
            }
        }

        



    }
}