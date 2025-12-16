/*
*  Switch statement
* */

package sept.ex_23092024_switch_Condition;

public class lab075 {
    public static void main(String[] args) {
      // Multiple choices in this. multiway branch statement
        // execute 1 condition with multiple way
        //support only byte, int,long (only wrapper type), enum,string,short
        // case sensitive so Pramod != pramod
        //variables are not allowed (constant or literal value should be for a case)
        // Advantage: Break and continue keyword can be use which can't be use in if/else case.
        //Syntax
//        switch(expression)
//        {
//            case statement 1:
//                code
//                        break;
//                case statement 2 :
//                    code
//                            break;
//                    default statement 1:   //this is optional
//                        code
//                                break;  //optional
 //       }

            //Example : days are 1-7 -> 1 for mon, 2 for tues and so on.....
int day =2;
        switch (day) {
            case 1:
                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thrusday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is sat");
                break;
            case 7:
                System.out.println("today is sun");
                break;
        }
        System.out.println("end of loop");

    }
}
