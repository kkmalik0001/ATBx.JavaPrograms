package sept.ex_11092024_DataTypes;

public class Lab0014_datatype {
    public static void main(String[] args) {

        //data_type variable_name = variable_value(literal)

        //data type are of 2 type ->> primitive and non-primitive
        // primitive data type are of 2 type -> boolean and Numeric
        // boolean have been covered in last labs
        // Numeric type is of 2 type _____>>> Integral Type( Integers (whole no) )AND Floating point type
        //Integral are byte, short, int, long and char  ( difference is on basis of size , how much they can store)

        // byte b = 128;    -->> this is not possible as max limit is from -128 to 127 for byte
        byte b= 127;
        short s = 128;      // Short range from -2^15 (-32,768) to 2^15-1 (32,767)
        System.out.println(b);

    }
}