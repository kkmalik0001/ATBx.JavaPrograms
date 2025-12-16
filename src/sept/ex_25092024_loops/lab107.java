package sept.ex_25092024_loops;

public class lab107 {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            if (i==5){
                continue;                     //means in case of 5 "After" will not print
            }
            System.out.println("After");
        }
    }
}
