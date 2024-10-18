package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0058_example {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(--a + a-- + a--);  // output = (9 + 9 + 8)
        System.out.println(a);   // output = (7)
        System.out.println(--a + a++ +a-0);   // output = (6 + 6 + 7)
        System.out.println(a);                // output = 7
        System.out.println(a-- + a-- + a--);    // output = 7 + 6 +5
        System.out.println(a);       //output = 4
    }
}
