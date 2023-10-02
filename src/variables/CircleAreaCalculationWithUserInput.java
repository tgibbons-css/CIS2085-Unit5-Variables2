package variables;

import java.util.Scanner;

public class CircleAreaCalculationWithUserInput
{
    public static void main(String[] args)
    {
        // Create Scanner object for getting user input.
        Scanner input = new Scanner(System.in);
        
        // Calculate the area of a circle.
        // 1. Get the name and radius from the user.
        System.out.println("Welcome!  This program will help you calculate the area of a circle.");
        System.out.print("What is the radius of your circle? ");
        double radius = input.nextDouble();
        input.nextLine();
        System.out.print("What is your first name? ");
        String firstName = input.nextLine();
        
        // 2. Calculate the area: radius * radius * pi.
        double area = radius * radius * Math.PI;

        // 3. Output the result to the user.
        System.out.println(firstName + ", the area of your circle is: " + area);
        
        System.out.println("Thanks for using our program!");
    }
}
