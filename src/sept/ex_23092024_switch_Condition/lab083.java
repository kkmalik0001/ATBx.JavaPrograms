package sept.ex_23092024_switch_Condition;

public class lab083 {
    public static void main(String[] args) {

        // FOR ,JDK>13......Now we can use multiple switch statement

        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are electronic gadget");
                break;
            case 004,006,007:
                    System.out.println("This is mechanical gadget");
                    break;
            default:
                System.out.println("None");
                break;
        }

    }
}
