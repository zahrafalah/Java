public class FunWithMath {

    public static void main(String[] args) {
        //Variables
        int height = 12,
                width = 6,
                area;

        byte ounces;
        byte pints;

        short cookSalary =440;
        int bossSalary = 44400;
        int cookHours = 47;
        double bossHours = 19.5;

        System.out.println(cookSalary/cookHours);
        System.out.println(bossSalary/bossHours);
        System.out.println(8/3);
        System.out.println(8.0/3);
        System.out.println(8/3.0);

        //negative num: most significant byte is 1 and not 0
//        bossSalary = cookSalary ; //widening
        //casting:
        cookSalary = (short) bossSalary; //Narrowing
        System.out.println(cookSalary);

        //primitive values
        char letter = 'c';
        boolean done = false;
        //string is like an objects that do stuff for us
        String sent = "Hello World";
        System.out.println(sent.toUpperCase());
        System.out.println(sent.length()+"\n");

        System.out.println(10/3);
        System.out.println(10%3);

    }


}
//
//    public static void main(String[] args){
//
//        byte humanAge = 2;
//        short dogsAge = 10;
//
//        String name = "Zahra Falah";
//
//        System.out.println(name);
//        System.out.println("Meachem said\"Write code, be happy\"!");
//        System.out.println("Average:\t36");
//        System.out.println("Mean:\t\t23.23");
//        System.out.println("");
//    }
