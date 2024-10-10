/*
*
* Relational op-->> who give relation and give always some type of boolean
*
* */
package sept.ex_16092024_operator;

public class Lab0038_relational_operator {
    public static void main(String[] args) {
        // <>,<=,>=, !=, !(not operator) -- >> they always give true or false

        int a =10;
        int b =30;
        boolean c= a > b;
        System.out.println(c);

        //output = false

        int age_user1 = 34;
        int age_user2 = 34;
        boolean result = age_user1 >= age_user2;
        System.out.println(result);

        //output =true
    }
}
