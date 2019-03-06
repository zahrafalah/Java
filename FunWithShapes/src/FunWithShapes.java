//import java.util.Scanner;
//public class FunWithShapes {
//
//    public static void main(String[] args){
//        boolean done = false;
//        char choice = 'Q';
//        while(!done){
//            printMenu();
//            choice = getChoice();
//            switch (choice){
//                case 'A':drawBox();break;
//                case 'Q':done = true;
//            }
//        }
//    }
//
//    public static getChoice(){
//        Scanner stdin = new Scanner(System.in);
//        char choice;
//        choice = stdin.nextLine().toUpperCase().charAt(0);
//        return choice;
//    }
//
//    public static void printMenu(){
//        System.out.println("Menu");
//        System.out.println("------");
//        System.out.println("A: Draw Box");
//        System.out.println("B: Draw Triangle");
//        System.out.println("Q: Quit");
//    }
//
//    public static void drawBox(){
//        for (int i = 0; i<= 10; i++){
//            for(int j =0; j <= 10; j++){
//                System.out.print("* ");}
//        }
//        System.out.println(" ");
//
//    }
//}


//        import java.util.Scanner;

//public class FunWithShapes {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        boolean done = false;
//        char choice = 'Q';
//        while (!done) {
//            printMenu();
//            choice = getChoice();
//            switch (choice) {
//                case 'A':
//                    drawBox();
//                    break;
//                case 'Q':
//                    done = true;
//                default : System.out.println("Learn how to read");
//            }
//        }
//
//    }
//
//
//    public static char getChoice() {
//        Scanner stdin = new Scanner(System.in);
//        char choice;
//        choice = stdin.nextLine().toUpperCase().charAt(0);
//        return choice;
//    }
//
//    public static void printMenu() {
//        System.out.println("Menu");
//        System.out.println("----");
//        System.out.println("A:   Draw Box");
//        System.out.println("B:   Draw Triangle");
//        System.out.println("C:   Quit");
//    }
//
//    public static void drawBox() {
//        Scanner stdin = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }
//
//}


import java.util.Scanner;

public class FunWithShapes {
    public static void main(String[] args) {

        boolean notDone = true;     // Flag of done or not
        char    choice;             // Choice from user

        while (notDone) {
            // Print Menu
            printMenu();
            // Get Choice
            choice = getChoice("ABCDEFGHIJQ");
            // Respond to choice
            switch (choice) {
                case 'A' : printBox(); break;
                case 'B' : printHollowBox(); break;
                case 'C' : printRectangle(); break;
                case 'D' : printHollowRectangle(); break;
                case 'E' : printTriangle();break;
                case 'F' : printHollowTriangle();break;
                case 'G' : printParallelagram(); break;
                case 'Q' : notDone = false;
            }
        }

    }

    public static void printTriangle() {
        System.out.println("Enter the height of the triangle");
        int height = getNumber(5, 30);

        // loop to iterate for the given number of rows
            for (int i = 1; i <= height ; i++) {

                //loop to print the number of spaces before the star
                for (int j = height; j >= i; j--) {
                    System.out.print(" ");
                }

                // loop to print the number of stars in each row
                for (int j = 1; j <= i ; j++){
                    System.out.print("* ");
                }
                System.out.println("");

            }
    }

    public static void printHollowTriangle(){
        System.out.println("Enter the height of the triangle");
        int height = getNumber(5,50);
         //Lopp to iterate for the given number of height
        //loop to print the number of spaces before the star

//



        for (int j = 1; j<=height -1 ; j++) {
            System.out.print("* ");
            for (int i = 1; i > j- 1; i--) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println("");
        }


        for (int i=1; i<= height ; i++){
            System.out.print("* ");
        }
        System.out.println();


    }


    public static void printParallelagram(){
        System.out.println("Enter width for Parallelagram");
        int width = getNumber(5, 50);

        for (int i = 1; i<= width; i++){
            //Printing space
            for (int j= 1 ;j<=i; j++){
                System.out.print(" ");
            }

            //printing stars in each row
            for (int j =width; j>= i; j--){
                System.out.print("* ");
            }
            for (int j= 1 ;j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }


    public static void printHollowRectangle(){
        System.out.println("Enter the width of rectangle");
        int width = getNumber(5, 50);
        int length = width + 4;

        for (int i = 0; i < length; i++){
            System.out.print("* ");
        }
        System.out.println("");

        for (int j =0; j< width -2; j++){
            System.out.print("* ");
            for (int i = 0; i< length-2; i++){
                System.out.print("  ");

            }
            System.out.print("* ");
            System.out.println("");
        }


        for (int i = 0; i < length; i++){
            System.out.print("* ");
        }
        System.out.println("");
    }


    public static void printRectangle() {

        System.out.println("Enter the width width of rectangle");
        int width = getNumber(5, 30);
        int length = width + 4;


        for (int j = 0; j < width ; j++){
            for (int i = 0; i < length; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

    }

    public static void printHollowBox(){
        System.out.println("Enter the width of the box");
        int width = getNumber(5, 30);
        for (int i= 0; i<=width; i++){
            System.out.print("* ");
        }
        System.out.println("");

        for (int j = 0; j<=width -2 ; j++) {
            System.out.print("* ");
            for (int i = 0; i < width - 1; i++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println("");
        }

        for (int i= 0; i<=width; i++){
            System.out.print("* ");
        }
        System.out.println("");
    }

    public static void printBox() {
        System.out.println("Enter the width of the box");
        int width = getNumber(5, 50);

        for (int i = 0; i < width; i++) {
            for (int j = 0;j < width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");
    }

    public static int getNumber(int min, int max) {
        Scanner stdin = new Scanner (System.in);
        int Number = -1;
        do {
            try {
                System.out.println("Enter a Number");
                Number = stdin.nextInt();
            }
            catch (Exception e) {
                System.out.println("Learn how to type!");
            }
        } while (Number < min || Number > max);
        return Number;
    }

    public static char getChoice(String validChars) {
        Scanner stdin = new Scanner(System.in);
        char choice = ' ';
        do {
            try {
                System.out.println("Enter choice from menu");
                choice = stdin.nextLine().toUpperCase().charAt(0);
            }
            catch (Exception e) {
                System.out.println("Type something bu##head!");
            }
        } while (validChars.indexOf(choice) == -1);
        return choice;
    }

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("----------");
        System.out.println("A  Print Box");
        System.out.println("B  Print Hollow Box");
        System.out.println("C  Print Rectangle");
        System.out.println("D  Print Hollow Rectangle");
        System.out.println("E  Print Triangle");
        System.out.println("F  Print HollowTriangle");
        System.out.println("G  Print Parallelagram");
        System.out.println("Q  Quit");
    }

}