package variables;

public class CircleAreaCalculation
{
    public static void main(String[] args)
    {
        // Calculate the area of a circle.;
        int radius = 5;
        
        // 2. Calculate the area: radius * radius * 3.14.
        double area = radius * radius * Math.PI;

        // 3. Output the result to the user.
        System.out.println("The area of a circle of radius " + radius + " is " + area + ".");
        
        double squareRootResult = Math.sqrt(radius);
        System.out.println("The square root of your radius is " + squareRootResult + ".");
        
        double powerResult = Math.pow(2, 3);
        System.out.println("2^3 is " + powerResult + ".");
    }
}
