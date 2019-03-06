import java.util.Scanner;

public class FunwithNestedIfs {
    public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);

        int x;
        System.out.println("Enter temperature");
        x= stdin.nextInt();
        if (x < 150) { //Dangling else!
            if (x > 90)
                System.out.println("Hot");
            else System.out.println("Nice");
        }else{
            System.out.println("INVAlID TEMP");
        }

        String str1 ="Hello";
        String str2= "HJ";
        System.out.println(str1.compareTo(str2));


        String description;
        //compositions,
        description = x > 100 ? "Hot" : "nice";
        System.out.println(description);
        //Or
//        System.out.println(x > 100 ? "Hot" : "nice");

    }
}
