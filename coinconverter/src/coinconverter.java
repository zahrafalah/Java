import java.util.Scanner;


public class coinconverter {
    //REQUIRED CONSTANTS
    public static final int QUARTERS_QTY = 25;
    public static final int NICKELS_QTY = 5;
    public static final int DIMES_QTY = 10;



    public static void main(String[] args){

        //variables
        Scanner input = new Scanner(System.in);
        int pennies, dimes, nickels, quarters;

        //Input
        System.out.println("Enter the number of pennies");
        pennies = input.nextInt();


        //Processing
        quarters = pennies/QUARTERS_QTY ;
        pennies = pennies%QUARTERS_QTY ;
        dimes = pennies/DIMES_QTY ;
        pennies = pennies%DIMES_QTY ;
        nickels =pennies/NICKELS_QTY;
        pennies = pennies%NICKELS_QTY;

        //Output
        System.out.println("Quarters :" + quarters + '\n' + "Pennies :" + pennies + "\n"+ "Dimes: "+  dimes + "\n"+"Nickels:"+ nickels );
    }


}
