package sept.ex_25092024_loops;

public class lab104 {

    public static void main(String[] args) {

        //LOOP AND CONDITION MIX
        for (int i = 1; i <=10 ; i++) {
            if (i==5){
                System.out.println("Five");
            }else {
                System.out.println(i);                     //output will be 1,2,3,4,Five,6,7,8,9,10
            }
        }
    }
}
