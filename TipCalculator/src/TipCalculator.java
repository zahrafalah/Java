
import java.util.Scanner;


public class TipCalculator {

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        int age;
        boolean discount = false;
        double tipAmount = .25;
        String feedback;
        String service;

        System.out.println("Enter your age");
        age = input.nextInt();
        input.nextLine();

        if (age <= 18 || age >= 60){
            discount = true;
        }
        System.out.println("Enter Service level, bad, good, great");
        feedback = input.nextLine();

//        if ( feedback== "bad"){
        //built in method for comparison of Strings
        if ( feedback.equalsIgnoreCase("bad")){
            tipAmount=.15;
        }else if(feedback.equalsIgnoreCase("good")){
            tipAmount=.20;

        }
        System.out.println(tipAmount);
//        System.out.println(discount);

        int x = 0;
        int y = 4;

        //example of short circut
        if (x != 0 && y/x == 0)
            System.out.println("yeah");
    }
}
