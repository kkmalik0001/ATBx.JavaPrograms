package sept.ex_20092024_ternaryOP_conditionANDloop;

public class Lab0073_max2NO {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =12;
        /*if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }*/
        //output: 12
        // if 3 condition then use else if  . take example of A and B both no same

        if(num1>num2){
            System.out.println(num1);
        }else if(num2>num1){
            System.out.println(num2);
        }else{
            System.out.println("Equal");
        }

    }
}

