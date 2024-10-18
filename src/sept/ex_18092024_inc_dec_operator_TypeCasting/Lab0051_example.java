package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0051_example {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
       // short s = phone_no;    // Narrowing - Implicit - JVM // Invalid
        short s1 = (short)  phone_no;// Narrowing - Explicit - Loss
        System.out.println(s1);
    }
}
