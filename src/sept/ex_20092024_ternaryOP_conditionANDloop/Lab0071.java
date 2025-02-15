package sept.ex_20092024_ternaryOP_conditionANDloop;

public class Lab0071 {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;                    // a = revert of a means false, so a = false now
        if (2 + 2 > 4) {
            System.out.println("Inside the loop");
        }
        System.out.println("Outside -> " +a);

        // here line 7 to 8 will not execute and add to just confuse
    }
}
