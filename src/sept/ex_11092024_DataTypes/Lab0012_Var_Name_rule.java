/*
*
* Variable name rule
*  data_type variable_name= variable_value;
* */

package sept.ex_11092024_DataTypes;

public class Lab0012_Var_Name_rule {
    public static void main(String[] args) {
        //Write code
        // data type variable_name = variable_value
        // boolean is_married = True; -> Wrong , True and False is nothing, use only true/false
        // is_married = true -> Wrong, Without data type container can't be created

        //  boolean 123 = true; -->> Not possible
        //  \variable name 123 is not possible

        // There will be set of rule for variable name (Identifier)
        // First character should be ALPHABET or $ or _

        // boolean kapil malik = true;
        // Space is not allowed

        //EXIT CODE 0 means success or no error

        boolean kapil123 =true;      //allowed
        boolean _123 =false;   // allowed
        System.out.println(_123);
        boolean KAPIL = true;      // allowed
        boolean kapil_malik = true;  //allowed
        System.out.println("KAPIL");
        System.out.println(kapil_malik);
    }
}
