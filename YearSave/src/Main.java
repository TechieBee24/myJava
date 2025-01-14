import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static double calcTotal(double n){
        double total;
        total = (n/2)*(n+1);
        return total;
    }

    private static int getDayOfYear(String date) {
        // Parse the input date in dd/MM format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, formatter);

        // Return the day of the year (1-365 or 1-366 for leap years)
        return parsedDate.getDayOfYear();
    }


    public static void main(String[] args) {

        double n;
        System.out.println("Enter date in dd/MM/yyyy fomart");

        Scanner sc = new Scanner(System.in);
        String date = sc.next();  // Example date: March 15
        n = getDayOfYear(date);

        System.out.print("Total for "+n+" days is\n"+calcTotal(n) +"/=");
    }
}