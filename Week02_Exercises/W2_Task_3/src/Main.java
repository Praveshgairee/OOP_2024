import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km,mile;
        Scanner converter = new Scanner(System.in);
        System.out.println("\n+++++++++++++++++++++++++++++++++");
        System.out.println("\t Miles into Kilometer");
        System.out.println("+++++++++++++++++++++++++++++++++\n");

        System.out.println("Enter a Miles :");
        mile = converter.nextFloat();

        km = (mile*1.60935);

        System.out.println("This "+mile+" is equal to "+km+" km.");



    }
}