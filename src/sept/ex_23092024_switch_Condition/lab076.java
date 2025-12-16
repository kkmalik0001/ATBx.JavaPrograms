/*
*  Switch statement
* */

package sept.ex_23092024_switch_Condition;

public class lab076 {
    public static void main(String[] args) {

        // if not use break --> then all condition after conditon true will be executed untill the break will found.
int day =2;
        switch (day) {
            case 1:
                System.out.println("today is monday");
            case 2:
                System.out.println("today is tuesday");
            case 3:
                System.out.println("today is wednesday");
            case 4:
                System.out.println("today is thrusday");
            case 5:
                System.out.println("today is friday");
            case 6:
                System.out.println("today is sat");
            case 7:
                System.out.println("today is sun");
        }

    }
}
