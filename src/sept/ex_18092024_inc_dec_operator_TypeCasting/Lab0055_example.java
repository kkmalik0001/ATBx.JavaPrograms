package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0055_example {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);        // output will be 11
        System.out.println(result);   // output = 11

        // line no  |  Exp   |   a
        // 5        |        |10
        // 6        | result = 10 | 11
        // 7        | result = 10 | 11
    }
}
