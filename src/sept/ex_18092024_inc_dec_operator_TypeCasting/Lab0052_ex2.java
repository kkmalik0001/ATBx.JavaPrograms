package sept.ex_18092024_inc_dec_operator_TypeCasting;

public class Lab0052_ex2 {
    public static void main(String[] args) {
        int course_fee = 100;
        float GST = 18.45F;
        //int total_price = course_fee + GST;   // Narrowing  - Implicit -JVM  - Invalid
        float total_price = course_fee + GST;
        System.out.println(total_price);

        // but if forcely try in int, IT will done by explicit but there will be a loss

        int total_price1 = course_fee + (int)GST;
        System.out.println(total_price1);
    }
}
