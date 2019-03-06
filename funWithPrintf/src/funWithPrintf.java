import java.util.Scanner;


public class funWithPrintf {

    public static void main(String[] args){
        Scanner stdin =new Scanner (System.in);
        int x = 122382;
        int w = 12345;
        double y = 3.1423123412;
        double z = 4334.829;
        String title1 = "Bruce";
        String title2 = "Burtha";
        System.out.printf("%15s %10.2f %,d %n" , "Brace" ,y ,x);
        System.out.printf("%15s %10.2f %d %n" , "Bertha" ,z ,x);


    }
}
