package sept.ex_25092024_loops;

public class lab098 {

    public static void main(String[] args) {

        for(float f =0.0f; f <=10.67; f++){              //float is valid syntax
            System.out.println("Hi float -> "+f);
            System.out.println(f);                        // we can write output in both way
        }

        for (byte b =0; b<=10; b++){                    // byte is valid syntax
            System.out.println("Hi , Float -> " + b);
        }

        // sp all numerical data type (float, int, double, long, short, char) are supportive but it will be confuse.
        // so try to use only int data type in loop
    }
}
