package sept.ex_06092024;

public class Lab005_Overloaded {
    public static void main(String[] args){
        System.out.println("Hello World");

    }

    public static void main(String args) {
        System.out.println("this is only string");
    }
    public static void main(int args) {
        System.out.println("this is int & these below 2 will not run");
    }
}
