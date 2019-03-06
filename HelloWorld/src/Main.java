// class means blue print,
public class Main {
    //create a class var available to anyone
    static String randomString = "string to print";
// creating a const that will not change over time(final &the name of the const should be all uppercase)
    static final double PINUM =  123.456789;
//Method header and body
    //static means only class can (execute) this func
    // void stating that this func is not returning any value
    public static void main(String[] args) {

        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("Hello World!");
        System.out.println(7+3);
        System.out.println(randomString);
        System.out.println(PINUM);
        System.out.println("3"+7);

        int integerOne = 22;
        int integerTwo = integerOne + 1;

        //primitive types:
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 922000000000L;
        float bigFloat = 3.1F;
        double bigDouble = 3.1482;
        boolean trueOrFalse = true;
        char randomChar = 66;
        System.out.println(randomChar);
        char anotherChar = 'S';
        char escapedChar ='\\';
        String randomString = "I'm a random string";
        String anotherString = "Stuff";

        String combinedString = randomString + ' '+ anotherString;
        System.out.println(combinedString);

        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String intString = Integer.toString(bigInt);
        System.out.println(byteString);


        //how to cast(convert) to another primitive value/except float,boolean and chr dont work
        double aDoubleValue = 3.176876;
        int doubleTwoInt = (int) aDoubleValue;
        System.out.println(doubleTwoInt);

        int stringToInt =Integer.parseInt(intString);
        System.out.println(stringToInt);

    }

}

