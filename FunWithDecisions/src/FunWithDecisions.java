import java.util.Scanner;

public class FunWithDecisions {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        int grade;
        System.out.println("Enter your Grade");
        grade = input.nextInt();

        if (grade >= 90 )
            System.out.println("Hey you got A ");
        else if ( grade >= 80){
            System.out.println("B");}
        else if (grade >= 70) {
            System.out.println("C");
        }else {
            System.out.println("Not good");
        }
    }
}
