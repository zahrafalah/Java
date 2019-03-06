import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class funwithobjects {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
        String input;
        String name;
        int x;
        double y;

        JOptionPane.showMessageDialog(null,"Welcome to my silly"+ "program!");
        name = JOptionPane.showInputDialog("Enter your name");
        input = JOptionPane.showInputDialog("Enter your age");
        x= Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter your IQ");
        y= Integer.parseInt(input);

        JOptionPane.showMessageDialog(null,
                 "\nname: \t" + name +
                         "\nAge: \t\t" + x +
                         "\nIQ: \t\t" + y);
//
        int w, t, z;
        input = JOptionPane.showInputDialog(null, "Enter " + "width of rectangle");
        w = Integer.parseInt(input);
        System.out.println(Math.pow(w,2));
        System.out.println(Math.sqrt(w));
        System.out.println(Math.hypot(w,w));

        //each and every time we want a new string we need to make one

        Integer myInt =new Integer(42);
        System.out.println(myInt);
    }

}
