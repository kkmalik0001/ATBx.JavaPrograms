/*
*
*   Primitive and non-primitive (user-defined) data type
*
* */

package sept.ex_11092024_DataTypes;

public class Lab0015_DataType_Type {
    public static void main (String [] args){

        // Primitive DATA TYPE

        byte b = 100; // 8 bits , 1 Byte
        short s = 128;  // 16 bits, 2  Byte
        int i = 1000;   // 32 bits, 4 Byte
        long phone_number = 9876543210l;   // at the end we have to add l or L. 64 Bits ,8 Byte
        long phone_number2 = 9876543219L;   // 64 Bits, 8 Byte

        char grade = 'A' ;  // char is also an integer. you can store character like 'A', b , c , e -- >ASCII VALUE  -IN ACTUAL INT VALUE ASSIGNED
        //2 BYTE and 16 Bits assigned

        float f = 3.14f;
        float f2 = 3.14F;     // decimal no, USE f or F. take 32Bits and 4 Byte

        double d = 118.9876543;   // big no with decimal   // 64 Bits and 8 Byte


     // Non Primitive Date type (user defined)

     String name = "kapil";    // String --->>> bunch of character(collection of chars)

        // other example: Array, Class, interface all are user defined (no-primitve)
    }
}
