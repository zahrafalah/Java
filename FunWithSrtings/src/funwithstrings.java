
import java.util.Scanner;

public class funwithstrings{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //strings can not change
        String str = "Hello World";
        //we have to make a new one to change it
        String str2 =  new String("Hello World");

        System.out.println(str.toUpperCase());
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(str.length()-1));


    }

}
