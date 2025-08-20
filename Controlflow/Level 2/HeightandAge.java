import java.util.Scanner;

public class HeightandAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Akbar : ");
        int AkbarAge = sc.nextInt();

        System.out.print("Enter age of Amar : ");
        int AmarAge = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int AnthonyAge = sc.nextInt();

        // Height
        System.out.print("Enter height of Akbar: ");
        double AkbarHeight = sc.nextDouble();

        System.out.print("Enter height of Amar: ");
        double AmarHeigth = sc.nextDouble();

        System.out.print("Enter height of Anthony: ");
        double AnthonyHeight = sc.nextDouble();


        if(AkbarAge < AmarAge && AkbarAge < AnthonyAge){
            System.out.println("Akbar is youngest");
        }else if(AmarAge < AkbarAge && AmarAge < AnthonyAge){
            System.out.println("Amar is youngest");
        }else{
            System.out.println("Anthony is youngest");
        }


        if(AkbarHeight > AmarHeigth && AkbarHeight > AnthonyHeight){
            System.out.println("Akbar is Tallest");
        }else if(AmarHeigth > AkbarHeight && AmarHeigth > AnthonyHeight){
            System.out.println("Amar is Tallest");
        }else{
            System.out.println("Anthony is Tallest");
        }

    }
}

