package sept.ex_23092024_switch_Condition;

public class lab084 {
    public static void main(String[] args) {
        int itemcode = 001;

        switch (itemcode){
case 001, 005 -> System.out.println("It is a laptop");          //multiple statement allowed
case 002 -> System.out.println("It is a laptop");
case 003 -> System.out.println("It is a laptop");
default-> System.out.println("It is a laptop");         // if use -> then no need to use break, if jdk >13

        }

    }
}
