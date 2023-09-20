import java.util.Scanner;

public class LoopyTroopy
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String rock = "Rock";
        String scissors = "Scissors";
        String paper = "Paper";

        System.out.println("U wanna play rock paper scissors noob?");

        String playerInput = scanner.nextLine();



        if (playerInput.equals("Yes") || playerInput.equals("yes") )
        {
            System.out.println("Alr, let's play, u rock, paper or scissors?");

            if (playerInput.equals("Rock") || playerInput.equals("rock"))
            {
                System.out.println(paper + " Ha, u lose noob!");
            }else if (playerInput.equals("Paper") || playerInput.equals("paper"))
            {
                System.out.println(scissors + " Ha, u lose noob!");
            }else if (playerInput.equals("Scissors") || playerInput.equals("scissors"))
            {
                System.out.println(rock + " Ha, u lose noob!");
            }else
            {
                System.out.println("Do u wish to continue");
            }
        } else
        {
            System.out.println("Okeh, bye noob!");
        }

    }

}
