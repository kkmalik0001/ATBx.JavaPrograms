package sept.ex_13092024_DT_Userdefined;

public class Lab0020_Stringformatting {
    public static void main(String[] args) {

        //String formatting
        // Problem statement - print the table of 9

        // If use hard code method it will be typical to use all calculation
        // System.out.println("9*1");    --->> of use like this it will be very difficult to use all

        // Better to use loops or something else

        // currently use FORMATTING CONCEPT

        // %d --> use this for any integer, byte, short , long
        // %s --> for String
        // %c --> for Char
        // %f --> for float, double

        int num = 9;
       // System.out.printf("value of %d",num);

        // % is directly correspond to value
        System.out.printf("%d * %d = %d", num,1,num*1);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,2,num*2);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,3,num*3);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,4,num*4);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,5,num*5);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,6,num*6);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,7,num*7);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,8,num*8);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,9,num*9);
        System.out.println("");
        System.out.printf("%d * %d = %d", num,10,num*10);
        System.out.println("");

    }
}
