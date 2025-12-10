//Grade calculator

package sept.ex_20092024_ternaryOP_conditionANDloop;

public class Lab0074_question {
    public static void main(String[] args) {

        // Grade Calculator
        // write a program that calculates and displays the letter grade for a given numerical
        //A : 90-100
        //b : 80-89
        //c : 70-79
        //d : 60-69
        //F : 0-59

        // STEP1: FIND USER INPUT and check for data type

        int score =19;

        // step2 : ask for return data type(string or char) for grade. eg interview say char
        // step 3: basic logic
        if (score>=90 && score<100){
            System.out.println('A');
        }else if (score>=80 && score<90){
            System.out.println('B');
        }else if (score>=70 && score<80){
            System.out.println('C');
        }else if (score>=60 && score<70){
            System.out.println('D');
        } else{
            System.out.println("Fail");
        }


    }
}
