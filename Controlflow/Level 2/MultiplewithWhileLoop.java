import java.util.Scanner;

public class MultiplewithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ypur number : ");
        int num = sc.nextInt();
        int i = 100 ;

        if( num <= 0 || num >= 100){
            System.out.println("Enter a postive number");
        }
        else{
            while ( i >= 1 ){
                if( num % i == 0){
                    System.out.println(i);
                }
                i--;
            }
        }
    }
}
