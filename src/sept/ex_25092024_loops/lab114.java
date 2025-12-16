package sept.ex_25092024_loops;

import java.util.Scanner;

public class lab114 {

    public static void main(String[] args) {

        //how to take a user input
        // to take input: we can use premade class scanner

        Scanner sc = new Scanner(System.in);      //new operator is used to create an object, use in oops concept class

        // system .in is an object created
        // this code is used to get an input from the user

        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter the string");
        String name = sc.next();
        System.out.println(name);
    }
}
