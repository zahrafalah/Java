import java.util.Scanner;


public class FunWithScanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int x;
        double y;
        String name;

          //Ask
        //Get
        System.out.println("Enter your name");
        name = input.nextLine();

        System.out.println("Enter x");
        x= input.nextInt();
        input.nextLine();
        System.out.println("Enter Y");
        y = input.nextDouble();

        System.out.println(name);
        System.out.println(x);
        System.out.println(y);
    }

}
