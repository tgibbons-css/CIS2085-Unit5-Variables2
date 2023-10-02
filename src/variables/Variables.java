package variables;

public class Variables
{
    public static void main(String[] args)
    {
        // Declaring variables.
        int numberOfPlanets;
        long populationOfEarth;
        double gradePointAverage;
        String userName;
        
        // Assigning values to variables.
        // = is the assignment operator.
        numberOfPlanets = 8;
        populationOfEarth = 7000000000L;
        gradePointAverage = 3.5;
        userName = "Kris";
        
        // Can declare a variable and assign it a value all on one line.
        int firstNumber = 3;
        int secondNumber = 10;
        secondNumber = 11;
        
        // Can assign the value of one variable to another variable.
        secondNumber = firstNumber;
        String currentUser = userName;
        
        // Mathematical Operations
        // + -> Addition
        // - -> Subtraction
        // * -> Multiplication
        // / -> Division
        // % -> Modulus (or Mod or Remainder)
        // () -> Parentheses - change the order of operation.
        
        // Can perform mathematical operations to the right of the assignment operator.
        secondNumber = secondNumber + 1;
        int difference = firstNumber - secondNumber;
        int average = (firstNumber + secondNumber) / 2;
        double gradePoints = 3.5 * 4;
        
        // Some shortcut operators also exist.
        // += -> adds a value to a variable.
        // -= -> subtracts a value from a variable.
        // Similar functionality for *=, /=, and %=.
        secondNumber += 1; // Adds 1 to secondNumber.  Same as secondNumber = secondNumber + 1.
        populationOfEarth *= 2;  // Doubles the population of Earth.
        
        // Increment and decrement operators.
        // ++ -> adds 1 to a variable.
        // -- -> subtracts 1 from a variable.
        firstNumber++; // Adds 1 to firstNumber;
        gradePoints--; // Subtracts 1 from gradePoints.
        
        // Outputting variables.
        System.out.println("The population of Earth is " + populationOfEarth + ".");
        System.out.println("The current user is " + currentUser + ".");
    }
}
