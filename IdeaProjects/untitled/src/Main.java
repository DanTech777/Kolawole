import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int mentalSupport = 5;
        String name = "Kenshi Takahashi";

        System.out.println("Hello world!");

        System.out.println(Math.pow(2.123456789012345678901234567890123456789012345678901234567890, 1234567));

        System.out.println();





        int bakuRank = 113;
        double hsp = 16.60;
        String bakugan = "Fear Ripper";

        System.out.println("Baku rank of bakugan is " + bakuRank);
        System.out.println("It has " + hsp + " hsp");
        System.out.println("It's name is " + bakugan);

        Scanner sc = new Scanner(System.in);

        System.out.print("Say something: ");
        sc.nextLine();

        if (9 + 10 == 11)
        {
            System.out.println("Naw dummy, it's 21");
        }

        String className = "English, Math, Chem, French, Ceramics";
        String teacherName = "Ms Silvers, Ms Reed, Mr Slapywappysussy, Madame McCartion, Ms Fergusson";

        System.out.println("These are my subjects: " + className);
        System.out.println("And these are their teachers: " + teacherName);

        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

        int grade = 16;

        double average = 78.8;

        boolean isOn = true;

        char letter = 'v';

        String name1 = "Mileena";

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();

        System.out.println("Hello there " + name);

        System.out.println("How old are you?");

        String stringAge = scanner.nextLine();

        int age = Integer.parseInt(stringAge);

        System.out.println("You can retire in " + (65 - age) + " years");


       
    }

}


//Primitive data types are variables, the ones u kno, int, float, double, etc.
//Use doubles and not floats in Java.
//Modulus "%" finds the remainder of the number after division