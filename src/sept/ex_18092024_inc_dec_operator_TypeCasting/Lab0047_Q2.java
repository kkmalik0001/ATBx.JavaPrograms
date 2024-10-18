/*
* byte b = 10; byte c = 10; then what type of data type will b + c take
* */

package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0047_Q2 {
    public static void main(String[] args) {
        byte b = 10;
        byte c = 10;
        int d = b + c ;   // by default sum convert to integer data type
        System.out.println(d);     // output = 20

        char c1 = 'A';     // ASCII VALUE = 65
        char c2 = 'B';     // ASCII VALUE = 66
        int c3 = c1 + c2;
        System.out.println(c3);       // output will be 131 as it take ASCII VALUE of A and B

        int d1 = 'D';
        System.out.println(d1);     // output = 68

        // whenever will do + it will take bigger one data type
    }
}
