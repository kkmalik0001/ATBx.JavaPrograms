package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0057_example {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);     // (10 + 12)

        // A -->> a++ -->> 10, after increment-->11
        // +
        // B -->> ++a -- >> , first increment a then exp--> 12,

        // after line 6 value of a will be 12

        System.out.println(a++ + a++);     // ( 12 + 13)

        // after line 14 value of a will be a++  --->>> 13+1 = 14
        System.out.println(a);     // output14
        System.out.println(++a + ++a);   // output (15 + 16) = 31
        System.out.println(a);   // output = 16

        System.out.println(a++ + a++ + ++a);   //output (16 + 17 + 19)
        System.out.println(a);   //output = 19

        System.out.println(++a + a++ + a++ + ++a);  // output (20 + 20 + 21 + 23 )
        System.out.println(a);   // output = 23

        System.out.println(a++ - ++a);     // ( 23 - 25)
        System.out.println(a);    // output = 25

    }
}
