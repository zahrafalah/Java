import java.util.Scanner;

public class Container {

    public static final int HUGE_CAPACITY = 50;
    public static final int LARGE_CAPACITY = 20;
    public static final int MEDIUM_CAPACITY = 5;
    public static final int SMALL_CAPACITY = 1;

    public static final double HUGE_COST = 35.00;
    public static final double LARGE_COST = 15.25;
    public static final double MEDIUM_COST = 4.25;
    public static final double SMALL_COST = 0.95;

    public static void main (String[] args){
    //Scanner Object
    Scanner Input = new Scanner(System.in);

    System.out.println("Widget Manufacturing Company" + '\n' + "Container Information Program" );


    //variable declaration
    int widgets;
    int smallPack;
    int largePack;
    int mediumPack;
    int hugePack;
    double totalCost;

    //Input
    System.out.println("Enter the number of widgets to be shipped: ");
    widgets = Input.nextInt();

    //Processing minimum number of packages needed:
        hugePack = widgets / HUGE_CAPACITY;
        widgets = widgets % HUGE_CAPACITY;
        largePack = widgets / LARGE_CAPACITY;
        widgets = widgets % LARGE_CAPACITY;
        mediumPack = widgets / MEDIUM_CAPACITY;
        widgets = widgets % MEDIUM_CAPACITY;
        smallPack =widgets/SMALL_CAPACITY;


    //Processing the total cost:

        totalCost= hugePack*HUGE_COST + largePack* LARGE_COST +mediumPack* MEDIUM_COST + smallPack* SMALL_COST;
    //OutPut
        System.out.println("Container(s)" +'\t'+'\t'+ "Number"+'\n');
        System.out.println("============" +'\t'+'\t'+"========"+'\n');
        System.out.println("Huge:" +'\t'+'\t'+'\t'+'\t'+ hugePack+'\n');
        System.out.println("Large:"+'\t'+'\t'+'\t'+'\t'+largePack+'\n');
        System.out.println("Medium:"+'\t'+'\t'+'\t'+'\t'+mediumPack+'\n');
        System.out.println("Small:"+'\t'+'\t'+'\t'+'\t'+ smallPack+'\n');
        System.out.println("============" +'\t'+'\t'+"========"+'\n');
        System.out.printf("Total cost            $%,.2f",totalCost+'\n');

}

}
