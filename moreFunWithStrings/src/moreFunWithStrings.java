import java.sql.SQLOutput;
import java.util.Scanner;


public class moreFunWithStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x =2;
        double y=3;
        String str ="Bubba and Berta went on a diet";
//        String str2;
        String str2 = "Bertha";



//        System.out.println("Enter a name followed by an int" + "followed by an Int");
//        str2 = input.next();
//        x = input.nextInt();
//        y =input.nextDouble();
//        System.out.println(str2+ " " + x + " " + y);

        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str2);
        //string are immutable: Once you make them you cant change it unless you assign it again.
        str2= str2.toUpperCase();
        System.out.println(str2);
        System.out.println(str.substring(7));
        System.out.println(str.substring(7,13));
        System.out.println(str.substring(str.indexOf(" ")+1));
        System.out.printf(str.substring(0, str.indexOf(" ")));
        System.out.println(str.substring(str.lastIndexOf(" ") +1));
    }
}
