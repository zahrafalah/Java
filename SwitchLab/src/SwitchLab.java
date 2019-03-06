import java.util.Scanner;

public class SwitchLab {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        String input;
        char grade;

        System.out.println("Enter your grade on the test");
        //composition
        grade = stdin.nextLine().toUpperCase().charAt(0);

//        if (input.equalsIgnoreCase("A"))
//            System.out.println("Great");
//        else
//            System.out.println("Looser");

        //Switch Statement
        switch (grade){

            case 'A' :
                System.out.println("Great");
            break;

            case 'B' :
                System.out.println("good");
                break;

            case 'C' :
                System.out.println("Meah");
                break;

            case 'D' :
                System.out.println("Yuck");
                break;

            case 'F' :
                System.out.println("Looser");
                break;
                default:
                    System.out.println("Cant you read???");

        }

    }
}
