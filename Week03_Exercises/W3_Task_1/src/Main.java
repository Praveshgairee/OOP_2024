import java.util.Scanner;
import java.text.NumberFormat;


public class Main
{
    public static void main (String[] args)
    {
        double currentSalary;  // employee's current  salary
        double raise;          // amount of the raise
        double newSalary;      // new salary for the employee
        String rating;         // performance rating


        Scanner scan = new Scanner(System.in);


        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();


        // Compute the raise using if ...

        if (rating.equalsIgnoreCase("excellent")){
            raise = (0.06 * currentSalary);
        }
        else if (rating.equalsIgnoreCase("good")){
            raise = (0.04 * currentSalary);
        }
        else if (rating.equalsIgnoreCase("poor")){
            raise = (0.015 * currentSalary);
        }
        else {
            raise = 0;
        }


        newSalary = currentSalary + raise;


        // Print the results
        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:       " + dollar.format(currentSalary));
        System.out.println("Amount of your raise: " + dollar.format(raise));
        System.out.println("Your new salary:      " + dollar.format(newSalary));
        System.out.println();
    }
}