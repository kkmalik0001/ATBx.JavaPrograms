package sept.ex_25092024_loops;

public class lab097 {
    public static void main(String[] args) {

        final boolean b1 =true;
        //b1 =false;     //final this is fixed now and can't change

//        for ( int i=0; b1; i ++ ){           // No condition--->> valid syntax with infinite loop
//            System.out.println("hello");
//        }
//        for ( int i=0; ; ){           // No updation, no condition --->> valid syntax with infinite loop
//            System.out.println("hello");
//        }
        for ( ; ; ){           // No initialization ,No updation, no condition --->> valid syntax with infinite loop
            System.out.println("hello");
        }
    }
}

