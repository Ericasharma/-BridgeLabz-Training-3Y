import java.time.LocalDate;
import java.util.Scanner;

public class DateAirthmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        
        LocalDate finalDate = newDate.minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + newDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        sc.close();
    }
}
