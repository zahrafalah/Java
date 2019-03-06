import java.util.Scanner;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
       Scanner S = new Scanner(System.in);
       char answer;

        System.out.println("Dinner Menue");
        System.out.println("------------------");
        System.out.println("A.  Steak");
        System.out.println("B.  Chicken");
        System.out.println("C.  Tofu");
        System.out.println(" Please select A, B, Or C >");

        //Get the answer from the user
        answer = S.nextLine().toUpperCase().charAt(0);

        //Switch Statement
        switch (answer) {

            case 'A':
                System.out.println("Mooo");
                break;
            case 'B':
                System.out.println("Cluck");
                break;
            case 'C':
                System.out.println("Yuck");
                break;
            default:
                System.out.println("Cant you read???");

        }

        int x = 10;
        switch (x) {

            case 10:
             x += 15;
                break;
            case 12:
              x -= 5 ;
                break;
            default:
                x *= 3;
        }
        System.out.println(x);






    }
}
