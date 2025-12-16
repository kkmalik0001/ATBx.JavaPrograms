package sept.ex_25092024_loops;

public class lab108 {
    public static void main(String[] args) {

        //print the value of even and odd number from 0 to 50

        for (int i =0; i<50; i++){
            if(i%2==0){
                System.out.println("this is even no -- >" +i);
            }
            else{
                System.out.println("odd no-->>"+i);
            }
            System.out.println(i);                     //this is out of loop so it will run separately, so remove this we use continue in next lab
        }
    }
}
