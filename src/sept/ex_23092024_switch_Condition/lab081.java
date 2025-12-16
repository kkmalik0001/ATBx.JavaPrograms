package sept.ex_23092024_switch_Condition;

public class lab081 {
    public static void main(String[] args) {
        char ch ='A';   //65
        switch (ch) {

        }
      /*  boolean b = true;
        switch (b){

        }  */      // boolean is not valid, we cannot use boolean in switch expression

        long a11 = 30l;                   // direct long is not supported, but need to convert back to integer
        switch ((int)a11) {

        }
    }
}
