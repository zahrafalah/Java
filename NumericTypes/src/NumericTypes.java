
import java.util.Scanner;

// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
 This program demonstrates how numeric types and
 operators behave in Java.

 * Assignment: NumericTypes
 * Name: Zahra Falah
 * Date: 2/6/2019
 */


public class NumericTypes
{
    public static void main (String [] args)
    {
        // TASK #2 Create a Scanner object here
        // (not used for alternate)
        Scanner input = new Scanner(System.in);


        // Identifier declarations
        final int NUMBER = 2 ;        // Number of scores
        final int SCORE1 = 100;       // First test score
        final int SCORE2 = 95;        // Second test score
        final int BOILING_IN_F = 212; // Boiling temperature
        int fToC;                     // Temperature Celsius
        double average;               // Arithmetic average
        String output;                // Line of output

        // TASK #2 declare variables used here
        String firstName;
        String lastName;
        String fullName;
        // TASK #3 declare variables used here
        char firstInitial;
        // TASK #4 declare variables used here
        double diameter, r, volume;
        // Find an arithmetic average.
        average = (double)(SCORE1 + SCORE2) / NUMBER;
        output = SCORE1 + " and " + SCORE2 +
                " have an average of " + average;
        System.out.println(output);

        // Convert Fahrenheit temperature to Celsius.
        fToC = (BOILING_IN_F - 32) * 5/9;
        output = BOILING_IN_F + " in Fahrenheit is " +
                fToC + " in Celsius.";
        System.out.println(output);
        System.out.println();      // To leave a blank line

        // ADD LINES FOR TASK #2 HERE
        // Prompt the user for first name
        System.out.println("Enter Your First Name Please");
        // Read the user's first name
        firstName = input.next();
        // Prompt the user for last name
        System.out.println("Enter Your Last Name Please");
        // Read the user's last name
        lastName = input.next();
        // Concatenate the user's first and last names
        fullName = firstName + " " + lastName;
        // Print out the user's full name
        System.out.println("User Full Name is: " + fullName);

        System.out.println();      // To leave a blank line

        // ADD LINES FOR TASK #3 HERE
        // Get the first character from the user's first name
        firstInitial = firstName.charAt(0);
        // Print out the user's first initial
        System.out.println("User first initial: " + firstInitial);
        // Convert the user's full name to uppercase
        fullName = fullName.toUpperCase();
        // Print out the user's full name in uppercase
        System.out.println("User's full name in uppercase: " + fullName);
        System.out.println();      // To leave a blank line

        // ADD LINES FOR TASK #4 HERE
        // Prompt the user for a diameter of a sphere
        System.out.println("Enter The Diameter For The Sphere Please");
        // Read the diameter
        diameter = input.nextDouble();
        // Calculate the radius
        r = diameter/2;
        // Calculate the volume
        volume = Math.pow(r, 3)* Math.PI * 4/3;
        // Print out the volume
        System.out.println("The volume of the sphere with diameter "+ diameter + " is: "+ volume);
    }
}
