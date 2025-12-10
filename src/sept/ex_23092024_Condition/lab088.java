package sept.ex_23092024_Condition;

public class lab088 {
    public static void main(String[] args) {

        //char c = 'a'    ---> find is it vowel, constant
        //condition ? expression_if_true : expression_if_false
        char ch = 'a';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

            System.out.println("vowel");
        }else {
            System.out.println("Constant");
        }
    }
}
