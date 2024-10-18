/*
*  Increment (++) and decrement operator (--)
* */

package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0053_increment_operator {
    public static void main(String[] args) {

        // pre - increment -->> ++operand
        // value is increment first and then stored in the result

       // int a = 10;
        // int b = ++a;   // a = a+1
        // System.out.println(b);    // output = 11
        // System.out.println(a);    // output =11

        // int a = 10;
        // System.out.println(++a);   // output = 11
       //  System.out.println(a);      // output = 11

        // Post a++
        //print first then increase

        int a_post = 10;
        System.out.println(a_post++);    // output till here will be 10
        System.out.println(a_post);    // output now will be 11 as increase by 1

    }
}
