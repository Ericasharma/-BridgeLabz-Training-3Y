import java.util.*; 
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        double num = sc.nextDouble();
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                System.out.println(i);
            }else{
                System.out.println("");
            }
        }
    }
}