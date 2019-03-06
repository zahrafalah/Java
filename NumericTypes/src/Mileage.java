import java.util.Scanner;

/**
 * Assignment: Mileage
 * Description: Calculating the Mileage by taking the Miles driven and gallons used from the user
 * Name: Zahra Falah
 * Date: 2/6/2019
 */

public class Mileage {

    public static void main(String[] args){
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Declare Variables
        double miles, galls, mileage;

        //Taking Inputs from the user
        System.out.println("This Program Will Calculate Mileage For You");
        // Prompt the user for miles driven
        System.out.println("How many miles did you drive? ");
        // Read the user's miles driven
        miles = input.nextDouble();
        // Prompt the user for gallons used
        System.out.println("How Many Gallons Did You Use?");
        // Read the user's gallons used
        galls = input.nextDouble();

        //Processing and Calculating the mileage
        mileage =  miles/galls ;

        //Output
        // Print out the user's Mileage in (mpg) unit
        System.out.println("Here is Your Mileage: " + mileage + "(mpg)");

    }
}
