package sept.ex_25092024_loops;

public class lab105 {

    //Debugging : it a technique where you run your program line by line to rectify how your program is running

    public static void main(String[] args) {
        //Print all the even no from 0 to 50

//        for (int i = 0; i <= 50; i += 2) {
//            System.out.println(i);
//        }
        for (int i=0; i<=50; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
