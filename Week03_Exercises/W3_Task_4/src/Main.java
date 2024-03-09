import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Numerator : ");
        int numerator = scan.nextInt();

        System.out.println("Enter an Denominator : ");
        int denominator = scan.nextInt();

        double result = (double)numerator/denominator;

        System.out.println("The result is : "+ result+ " .");


    }
}