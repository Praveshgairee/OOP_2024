// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
        //computer's play


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();


        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        System.out.println("Enter your play [r(Rock),s(Scissor),p(Paper)]: ");
        personPlay = scan.next().toUpperCase();


            //Generate computer's play (0,1,2)
            computerInt = generator.nextInt(3);
            //Translate computer's randomly generated play to string
            switch (computerInt) {
                case 0:
                    computerPlay = "R";
                    break;

                case 1:
                    computerPlay = "S";
                    break;

                case 2:
                    computerPlay = "P";
                    break;

                default:
                    computerPlay = "R";

            }


            //Print computer's play

            if (!(personPlay.equals("R") || personPlay.equals("S") || personPlay.equals("P") )){
                System.out.println("Please input valid option.");
            }
            else {
                System.out.println("The Computer Output is : " + computerPlay + ".");
            }


            //See who won.  Use nested ifs instead of &&.

            if (personPlay.equals(computerPlay))
                System.out.println("It's a tie!");

            else if (personPlay.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors.  You win!!");
                else
                    System.out.println("Paper covers rock.  You loose!!");
            else if (personPlay.equals("P"))
                if (computerPlay.equals("R"))
                    System.out.println("Paper covers rock.  You win!!");
                else
                    System.out.println("Scissor cut paper .  You loose!!");
            else if (personPlay.equals("S"))
                if (computerPlay.equals("R"))
                    System.out.println("Rock crushes scissors.  You loose!!");
                else
                    System.out.println("Scissor cut Paper.  You win!!");



            //...  Fill in rest of code
        }
    }
    