import java.util.Scanner;

public class Quizz {
    public static void main(String[] args)
    {
        String dragonKing = "Onaga";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the black man quiz!!!");
        System.out.println("----------------------------------------------");
        System.out.println("What's the name of the Dragon King?");
        String answer = scanner.nextLine();

        if (answer.equals(dragonKing))
        {
            System.out.println("Excellent...");

        } else
        {
            System.out.println("Disappointment...");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Who is Kuai Liang's brother?");

        String subZero = "Bi Han";
        String answer2 = scanner.nextLine();

        if (answer2.equals(subZero))
        {
            System.out.println("Victory...");
        } else
        {
            System.out.println("Failure...");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("What realm is Mileena from?");

        String realmName = "Outworld";
        String answer3 = scanner.nextLine();

        if (answer3.equals(realmName))
        {
            System.out.println("Well done...");
        } else
        {
            System.out.println("Your creation was a mistake...");
        }


    }
}
