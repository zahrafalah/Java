
import javax.swing.JOptionPane;

/**
 * Assignment: WindChill
 * Description: Calculating the windchill formula by taking in the temperature and speed from the user
 * Name: Zahra Falah
 * Date: 2/3/2019
 */

public class windchill {
    public static void main(String[] args){
        // Variables declaration
        String input;
        String WC;
        double t;
        double v;
        double w;

        // Input
        //asking the user for the inputs
        input = JOptionPane.showInputDialog("Enter The Temperature(F): ");
//      //returns a new double initialized to the value represented by the specified String
        t = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter The Wind Speed(m/h): ");
        v =  Double.parseDouble(input);

        // Processing
        //calculating the Windchill based on the formula
        w = 91.4 - (91.4 - t)*(0.478 + 0.301*(Math.sqrt(v)) - 0.02*v);
        //formatting double output to one decimal
        WC = String.format("%,.1f", w);

        // Output
        JOptionPane.showMessageDialog(null,
                "\nTemperature(F) : \t" + t +
                        "\nWind Speed(m/h) : \t\t" + v +
                        "\nWindChill : \t\t" + WC);

    }
}
