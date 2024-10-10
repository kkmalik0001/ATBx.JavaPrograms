package sept.ex_16092024_operator;

public class Lab0034 {
    public static void main(String[] args) {
        String first_name = "kapil" ;
        String last_name = "Malik" ;
        int a = 10;
        int b = 10;

        // Here + is a concatenation operator
        // if + use with int like int + int -->> it is math
        // if use with String it combine (concat them)

        System.out.println(first_name + last_name);
        System.out.println(a + b + first_name + last_name);

        //output for above will be 20kapilMalik
        // output for below will be kapilMalik1010 ,
        // because if first is string then + operator will do concatenate will open, math will not done.
        System.out.println(first_name + last_name + a + b);

        // if use bracket then kapilMalik20 will print
        System.out.println(first_name + last_name + (a + b));
    }
}
