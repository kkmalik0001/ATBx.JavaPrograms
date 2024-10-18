/*
* Type Casting
* */

package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0050_TypeCasting {
    public static void main(String[] args) {
        //Type Casting
        // Widening - Implicit , Explicit - lossless
        //Narrowing - Implicit, Explicit(with data type), loss

        // Widening means a bigger has been used automatically by JVM
        byte b = 10;
        int a = b;   // This is a valid text syntax, we have done implicit casting done by JVM
        int a1 = (int)b;   // This is a valid text syntax, we have done Explicit casting done by JVM

        // implicit and explicit both are same in widening either you write or not

        //  Narrowing
        int val = 300;
        // byte b1 = val;   // not possible , invalid Implicit Casting  -- JVM
        byte b2 = (byte) val;   // but if trying to put in smaller bucket, then explicit casting will work and loss of data may occur

        System.out.println(b2);

        // output will be 44 and not 300 as byte will store only till 8 bits from 32 bits of int val = 300; ,
        // which is  00101100
    }
}
