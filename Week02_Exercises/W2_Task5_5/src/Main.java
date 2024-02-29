import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        double decimal;

        // Input

        System.out.println("Enter Numerator : ");
        numerator =scanner.nextInt();

        System.out.println("Enter Denominator : ");
        denominator =scanner.nextInt();

        // Calculation
         decimal = (double)numerator/denominator;

         //output
        System.out.println("The decimal equivalent is: " + decimal);
        
        scanner.close();




    }
}