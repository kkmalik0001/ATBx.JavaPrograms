//Grade calculator

package sept.ex_20092024_ternaryOP_conditionANDloop;

public class Lab0074_question_2ndway {
    public static void main(String[] args) {

        int score =99;

        // step2 : ask for return data type(string or char) for grade. eg interview say char
        char grade = 'X';

        // step 3: basic logic
        if (score>=90 && score<100){
           grade = 'A';
        }else if (score>=80 && score<90){
            grade = 'B';
        }else if (score>=70 && score<80){
            grade = 'C';
        }else if (score>=60 && score<70){
            grade = 'd';
        } else{
            grade = 'f';
        }
        System.out.println("your grade is ->" +grade);

    }
}
