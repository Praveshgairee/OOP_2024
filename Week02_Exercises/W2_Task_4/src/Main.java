import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);

        double length, area, perimeter;

        //Input
        System.out.println("Enter the Length of a Square :");
        length = convert.nextDouble();

        //Conversion
        area = (length*length);
        perimeter = (4*length);

        //output
        System.out.println("The Area of Square is : "+area+" .");
        System.out.println("The Perimeter of Square is :" + perimeter+" .");

    }
}