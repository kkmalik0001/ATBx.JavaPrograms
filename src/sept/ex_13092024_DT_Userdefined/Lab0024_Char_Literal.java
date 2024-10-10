/*
*
* Character Literals  : A char type variable can hold following:
1. Single character
2. Escape Sequence
3. ASCII Value
4. UNICODE Character
5. Octal Character

*
* */


package sept.ex_13092024_DT_Userdefined;

public class Lab0024_Char_Literal {
    public static void main(String[] args) {

        // character(Char) literal
        // Single char  -- >> enclosed in single quotation marks

        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';          // carriage return

        System.out.println("Kapil"+ new_line + "Malik");   // without declaring variable we can directly use variable value ( '\n')
        System.out.println("Kapil"+ tab_line + "Malik");
        System.out.println("Kapil"+ back_space + "Malik");
        System.out.println("Kapil"+ car_r + "Malik");                 // delete full word

        /*
        * ASCII (american standard code) value are assigned to each character , so char are also basically integer
        * for example ASCII value of A is 65 and a is 97
        * after that UNICODE was assigned so that everyone can follow that(all world)
        * unicode value of A : \u0041, so each char has some UNICODE value
        * */

        char c11 = '\u1F60' ;          //smily unicode char
        System.out.println(c11);

        char octal_A = '\101' ;          //octal representation of A
        System.out.println("The character in octal escape is : " + octal_A);

        char asciiA = '\u0041';         // unicode value of A
        System.out.println("The character is: " + asciiA);

        char asciiB = 66; // ASCII value of 'A'   // ASCII value of B is 66
        System.out.println("The character is: " + asciiB);

    }
}
