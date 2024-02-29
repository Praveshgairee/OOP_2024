// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int val1, val2;

        double average,val3;
        Scanner scan = new Scanner(System.in);


        // get three values from user
        System.out.println("Please enter three integers and " +
                "I will compute their average \n");

        System.out.println("Enter the first integer :");
        val1 = scan.nextInt();
        System.out.println("Enter the second integer :");
        val2 = scan.nextInt();
        System.out.println("Enter the third integer :");
        val3 = scan.nextDouble();








                //compute the average
        average = (val3+val2+val3)/3;





        //print the average
        System.out.println("The average of given input is " + average + " .");



    }
}